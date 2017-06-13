/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;

import java.util.Random;


/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
       String[] schemes = {"http","https", "file"};

       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   UrlValidator urlVal2 = new UrlValidator(schemes, null, UrlValidator.ALLOW_2_SLASHES);
       UrlValidator urlVal3 = new UrlValidator(null, null, UrlValidator.NO_FRAGMENTS);

	   System.out.println(urlVal.isValid("http://www.amazon.com"));

        //checking for url
       assertFalse("null should not valid",
               urlVal.isValid(null));
       assertFalse("empty should not valid",
               urlVal.isValid(""));
       assertFalse("simple string should not valid",
               urlVal.isValid("hi"));

        //checking slashes
       assertFalse("3 slashes should not valid",
               urlVal.isValid("http:///"));
       assertFalse("2 slashes should not valid in urlval",
               urlVal.isValid("http://www.amazon.com//"));
       assertTrue("two slashes enabled should valid",
               urlVal2.isValid("http://www.amazon.com//"));
       assertFalse("single slash should not be valid in two slashes enabled",
               urlVal.isValid("http:/amazon.com"));

        //checking schemes
       assertTrue("should be valid",
               urlVal.isValid("http2://www.amazon.com"));
       assertFalse("should not valid",
               urlVal.isValid("2http://www.amazon.com"));
       assertFalse("invalid scheme with set schemes enabled",
               urlVal2.isValid("http2://www.amazon.com"));
       assertTrue("should be valid",
               urlVal2.isValid("file://"));//valid file
       assertFalse("file should not have .com not valid",
               urlVal2.isValid("file://.com"));//invalid file

       //checking fragments
       assertFalse("fragment with fragment disabled",
               urlVal3.isValid("http://www.amazon.com/foo.html#bar"));
       assertTrue("fragment with fragment enabled",
               urlVal.isValid("http://www.amazon.com/foo.html#bar"));
   }
   
   
   public void testYourFirstPartition() {
        //check valid schemes
        UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

        assertTrue("should be valid",
                urlVal.isValid("http://www.amazon.com"));
        assertTrue("should be valid",
                urlVal.isValid("ftp://www.amazon.com"));
        assertTrue("should be valid",
                urlVal.isValid("h3t://www.amazon.com"));
        assertTrue("should be valid",
                urlVal.isValid("www.amazon.com"));

        assertFalse("should not be valid",
                urlVal.isValid("ptth://www.amazon.com"));
        assertFalse("should not be valid",
                urlVal.isValid("http:/www.amazon.com"));
        assertFalse("should not be valid",
                urlVal.isValid("http:www.amazon.com"));
        assertFalse("should not be valid",
                urlVal.isValid("http/www.amazon.com"));
        assertFalse("should not be valid",
                urlVal.isValid("://www.amazon.com"));

   }
   
   public void testYourSecondPartition(){
       //IP testing
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

       assertTrue("should be valid",
               urlVal.isValid("http://12.123.45.67"));
       assertTrue("should be valid",
               urlVal.isValid("http://255.255.255.255"));
       assertTrue("should be valid",
               urlVal.isValid("http://0.0.0.0/8"));
       assertTrue("should be valid",
               urlVal.isValid("https://0.0.0.0"));
       assertTrue("should be valid",
               urlVal.isValid("http://1.1.1.1:8"));

       assertFalse("should not be valid with 1 extra",
               urlVal.isValid("http://1.1.1.1.1"));
       assertFalse("should not be valid with negative",
               urlVal.isValid("http://-1.1.1.1"));
       assertFalse("should not be valid with overload",
               urlVal.isValid("http://300000.3000000.3000000.30000000"));
       assertFalse("should not be valid with too char",
               urlVal.isValid("http://1.1.a.1"));
	   
   }
   
   
   public void testIsValid()
   {
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
       UrlValidator urlVal2 = new UrlValidator(null, null, UrlValidator.NO_FRAGMENTS+UrlValidator.ALLOW_2_SLASHES+UrlValidator.ALLOW_ALL_SCHEMES);

       //from Final Project Part A
       ResultPair[] testUrlScheme = {
               new ResultPair("http://", true),
               new ResultPair("ftp://", true),
               new ResultPair("h3t://", true),
               new ResultPair("", true),
               new ResultPair("3ht://", false),
               new ResultPair("http:/", false),
               new ResultPair("http:", false),
               new ResultPair("http/", false),
               new ResultPair("://", false)
       };

       ResultPair[] testUrlAuthority = {
               new ResultPair("www.google.com", true),
               new ResultPair("go.com", true),
               new ResultPair("go.au", true),
               new ResultPair("0.0.0.0", true),
               new ResultPair("255.255.255.255", true),
               new ResultPair("256.256.256.256", false),
               new ResultPair("255.com", true),
               new ResultPair("1.2.3.4.5", false),
               new ResultPair("1.2.3.4.", false),
               new ResultPair("1.2.3", false),
               new ResultPair(".1.2.3.4", false),
               new ResultPair("go.a", false),
               new ResultPair("go.a1a", false),
               new ResultPair("go.cc", true),
               new ResultPair("go.1aa", false),
               new ResultPair("aaa.", false),
               new ResultPair(".aaa", false),
               new ResultPair("aaa", false),
               new ResultPair("", false)
       };
       ResultPair[] testUrlPort = {
               new ResultPair(":80", true),
               new ResultPair(":65535", true),
               new ResultPair(":0", true),
               new ResultPair("", true),
               new ResultPair(":-1", false),
               new ResultPair(":65636", true),
               new ResultPair(":65a", false)
       };
       ResultPair[] testPath = {
               new ResultPair("/test1", true),
               new ResultPair("/t123", true),
               new ResultPair("/$23", true),
               new ResultPair("/..", false),
               new ResultPair("/../", false),
               new ResultPair("/test1/", true),
               new ResultPair("", true),
               new ResultPair("/test1/file", true),
               new ResultPair("/..//file", false),
               new ResultPair("/test1//file", false)
       };
       //Test allow2slash, noFragment
       ResultPair[] testUrlPathOptions = {new ResultPair("/test1", true),
               new ResultPair("/t123", true),
               new ResultPair("/$23", true),
               new ResultPair("/..", false),
               new ResultPair("/../", false),
               new ResultPair("/test1/", true),
               new ResultPair("/#", false),
               new ResultPair("", true),
               new ResultPair("/test1/file", true),
               new ResultPair("/t123/file", true),
               new ResultPair("/$23/file", true),
               new ResultPair("/../file", false),
               new ResultPair("/..//file", false),
               new ResultPair("/test1//file", true),
               new ResultPair("/#/file", false)
       };

       ResultPair[] testUrlQuery = {new ResultPair("?action=view", true),
               new ResultPair("?action=edit&mode=up", true),
               new ResultPair("", true)
       };

       Random random = new Random(System.currentTimeMillis());

	   for(int i = 0;i<10000;i++)
	   {
		   boolean urlValid = true;
		   int goodURL = 0;
		   int badURL = 0;

		   String test = "";

		   int randomScheme = random.nextInt(testUrlScheme.length);
		   int randomAuth = random.nextInt(testUrlAuthority.length);
		   int randomPath1 = random.nextInt(testPath.length);
		   int randomPath2 = random.nextInt(testUrlPathOptions.length);
		   int randomQuery = random.nextInt(testUrlQuery.length);

		   //test randomScheme
           for(int j=0; j < testUrlScheme.length; j++)
           {
               if(j == randomScheme)
               {
                   test += testUrlScheme[j].item;
                   if(testUrlScheme[j].valid== false)
                   {
                       urlValid = false;
                       badURL++;
                       System.out.println("Invalid Scheme   " + testUrlScheme[j].item);
                   }
                   goodURL++;
               }
           }

           //test randomAuth
           for(int k=0; k < testUrlAuthority.length; k++)
           {
               if(k == randomAuth)
               {
                   test += testUrlAuthority[k].item;
                   if(testUrlAuthority[k].valid== false)
                   {
                       urlValid = false;
                       badURL++;
                       System.out.println("Invalid Authority   " + testUrlAuthority[k].item);
                   }
                   goodURL++;
               }
           }

           int pathoption = random.nextInt(2);
           if (pathoption == 0){
                //test randomPath1
                for(int a=0; a < testPath.length; a++)
                {
                    if(a == randomPath1)
                    {
                        test += testPath[a].item;
                        if(testPath[a].valid== false)
                        {
                            urlValid = false;
                            badURL++;
                            System.out.println("Invalid Authority   " + testPath[a].item);
                        }
                        goodURL++;
                    }
                }
           }else{
                //test randomPath2
                for(int b=0; b < testUrlPathOptions.length; b++)
                {
                    if(b == randomPath2)
                    {
                        test += testUrlPathOptions[b].item;
                        if(testUrlPathOptions[b].valid== false)
                        {
                             urlValid = false;
                            badURL++;
                            System.out.println("Invalid Authority   " + testUrlPathOptions[b].item);
                        }
                        goodURL++;
                    }
                }
           }

           //test randomQuery
           for(int c=0; c < testUrlQuery.length; c++)
           {
               if(c == randomQuery)
               {
                   test += testUrlQuery[c].item;
                   if(testUrlQuery[c].valid== false)
                   {
                       urlValid = false;
                       badURL++;
                       System.out.println("Invalid Authority   " + testUrlQuery[c].item);
                   }
                   goodURL++;
               }
           }

           System.out.println(test);
           System.out.println(goodURL);
           System.out.println(badURL);

           if(pathoption == 0){
               System.out.println("2 slashes and No-Fragment Enabled");
               assertEquals(urlValid, urlVal.isValid(test));
           }else{
               assertEquals(urlValid, urlVal2.isValid(test));
           }

	   }
   }
   
   public void testAnyOtherUnitTest()
   {
	   
   }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */
   

}

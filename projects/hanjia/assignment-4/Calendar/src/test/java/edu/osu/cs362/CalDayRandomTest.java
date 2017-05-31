package edu.osu.cs362;


import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
	public static String RandomSelectMethod(Random random){
		String[] methodArray = new String[] {"setStartHour", "setStartMinute", "setStartDay", "setStartMonth", "setStartYear", "setTitle","setDescription"};// The list of the of methods to be tested in the Appt class

		int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

		return methodArray[n] ; // return the method name
	}
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


		 System.out.println("Start testing...");


		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {

			 GregorianCalendar greg = new GregorianCalendar();
			 CalDay cal = new CalDay(greg);

			 long randomseed =10;//System.currentTimeMillis();
			 //			System.out.println(" Seed:"+randomseed );
			 Random random = new Random(randomseed);

			 int startHour=10;
			 int startMinute=55;
			 int startDay=30;
			 int startMonth=5;
			 int startYear=2017;
			 String title="random";
			 String description="test";
			 //Construct a new Appointment object with the initial data
			 for (int i = 0; i < NUM_TESTS; i++) {
				 Appt appt = new Appt(startHour,
						 startMinute ,
						 startDay ,
						 startMonth ,
						 startYear ,
						 title,
						 description);

				 Integer newHour = ValuesGenerator.getRandomIntBetween(random, -24, 24);
				 appt.setStartHour(newHour);

				 Integer newMin = ValuesGenerator.getRandomIntBetween(random, -120, 120);
				 appt.setStartMinute(newMin);

				 Integer newDay = ValuesGenerator.getRandomIntBetween(random, -31, 31);
				 appt.setStartDay(newDay);

				 Integer newMonth = ValuesGenerator.getRandomIntBetween(random, -12, 12);
				 appt.setStartMonth(newMonth);


				 Integer newYear = ValuesGenerator.getRandomIntBetween(random, -100, 100);
				 appt.setStartYear(newYear);


				 String newTitle= ValuesGenerator.getString(random);
				 appt.setTitle(newTitle);


				 String newDesc = ValuesGenerator.getString(random);
				 appt.setDescription(newDesc);

				 cal.addAppt(appt);
			 }

			 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			 if((iteration%10000)==0 && iteration!=0 )
				 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

		 }


		 System.out.println("Done testing...");


	 }


	
}

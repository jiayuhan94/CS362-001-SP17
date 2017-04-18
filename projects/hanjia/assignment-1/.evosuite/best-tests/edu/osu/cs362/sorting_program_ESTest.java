/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 17 21:44:19 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.osu.cs362.sorting_program;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class sorting_program_ESTest extends sorting_program_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SystemInUtil.addInputLine("84");
      SystemInUtil.addInputLine("84");
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        sorting_program.main(stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[4];
      SystemInUtil.addInputLine("QipX^H{:x.#");
      // Undeclared exception!
      try { 
        sorting_program.main(stringArray0);
        fail("Expecting exception: InputMismatchException");
      
      } catch(InputMismatchException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      sorting_program sorting_program0 = new sorting_program();
  }
}

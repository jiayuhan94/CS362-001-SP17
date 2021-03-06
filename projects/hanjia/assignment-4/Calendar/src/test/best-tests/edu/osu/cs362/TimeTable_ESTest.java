/*
 * This file was automatically generated by EvoSuite
 * Wed May 31 05:07:06 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.osu.cs362.Appt;
import edu.osu.cs362.CalDay;
import edu.osu.cs362.TimeTable;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TimeTable_ESTest extends TimeTable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      LinkedList<Appt> linkedList0 = calDay0.appts;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1, 3007, 3007, 3007, 3007, 1);
      // Undeclared exception!
      try { 
        timeTable0.getApptRange(linkedList0, mockGregorianCalendar0, mockGregorianCalendar1);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      Appt appt0 = new Appt(505, (-1273), 1, (-1273), 1, "Millisecond", "");
      linkedList0.add(appt0);
      Appt appt1 = new Appt(1, 1, 1, 1, 48, "Millisecond", "");
      timeTable0.deleteAppt(linkedList0, appt1);
      assertEquals(1, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      linkedList0.push((Appt) null);
      Appt appt0 = new Appt(1, 1, 1, 1, 48, "vdqmuM4i(", "Millisecond");
      // Undeclared exception!
      try { 
        timeTable0.deleteAppt(linkedList0, appt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.TimeTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      LinkedList<Appt> linkedList0 = calDay0.appts;
      Appt appt0 = new Appt(1, 1, 1, 3007, 3007, "~Z{#g:r&Mo($Ayiis", "~Z{#g:r&Mo($Ayiis");
      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, appt0);
      assertNull(linkedList1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, (Appt) null);
      assertNull(linkedList1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      Appt appt0 = new Appt(42, 42, (-2106), (-2106), (-2106), "dbt<(y4;:r4f_gqL*F^", "dbt<(y4;:r4f_gqL*F^");
      LinkedList<Appt> linkedList0 = timeTable0.deleteAppt((LinkedList<Appt>) null, appt0);
      assertNull(linkedList0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(42, 42, (-1255));
      // Undeclared exception!
      try { 
        timeTable0.getApptRange((LinkedList<Appt>) null, mockGregorianCalendar0, mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Second date specified is not before the first date specified.
         //
         assertThrownBy("edu.osu.cs362.TimeTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2000, 1, 2000, 0, 2000, (-1778));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        timeTable0.getApptRange((LinkedList<Appt>) null, mockGregorianCalendar0, mockGregorianCalendar1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.TimeTable", e);
      }
  }
}

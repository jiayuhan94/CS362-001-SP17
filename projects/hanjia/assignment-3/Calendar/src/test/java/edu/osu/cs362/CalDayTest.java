package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import static org.junit.Assert.*;


public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		CalDay CalDay = new CalDay();
		assertEquals(false,CalDay.valid);
		assertEquals(null, CalDay.getAppts());
		CalDay.isValid();
		CalDay.iterator();
	 }

	 @Test
    public void CalDayTest1()  throws Throwable  {
         GregorianCalendar today = new GregorianCalendar(2017,4,29);
         CalDay test = new CalDay(today);
         test.toString();
         test.iterator();
         assertNotNull(test.getAppts().iterator());
         assertEquals(0,test.getSizeAppts());
         assertEquals(29, test.getDay());
         assertEquals(4,test.getMonth());
         assertEquals(2017,test.getYear());
         assertEquals(true,test.isValid());
         assertEquals(new LinkedList(), test.getAppts());
     }

     @Test
    public void addApptTest()  throws Throwable  {
        GregorianCalendar today = new GregorianCalendar(2017,5,1);
        Appt temp_1 = new Appt(1,1,1,5,2017,null, null);
        Appt temp_2 = new Appt(2,1,1,5,2017,null, null);
        Appt temp_3 = new Appt(25,1,1,5,2017,null, null);
        CalDay test = new CalDay(today);
        test.iterator();
        test.addAppt(temp_1);
        test.addAppt(temp_2);
        test.addAppt(temp_3);
        assertTrue(new CalDay(today).valid);
        assertEquals(1, (test.getAppts()).get(0).getStartHour());
        assertEquals(2, (test.getAppts()).get(1).getStartHour());

        assertFalse((test.iterator())==null);
         test.toString();
         test.valid = false;
         test.addAppt(temp_1);
         assertEquals(null, test.iterator());
         assertEquals("", test.toString());

         test.appts = null;
         test = new CalDay(today);
         assertEquals(new LinkedList<Appt>(), test.appts);
     }

     @Test
    public void toStringTest1()  throws Throwable  {
         GregorianCalendar today = new GregorianCalendar(2017,5,1);
         Appt temp_1 = new Appt(5,7,9,1,2016,null, null);
         Appt temp_2 = new Appt(4,7,5,3,2016,null, null);
         Appt temp_3 = new Appt(1,1,1,4,2016,null, null);
         CalDay temp = new CalDay(today);
         temp.addAppt(temp_1);
         temp.addAppt(temp_2);
         temp.addAppt(temp_3);
         temp.iterator();
         assertNotNull(temp.toString());
     }

}

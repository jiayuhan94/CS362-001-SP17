package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import org.junit.Test;

import java.util.GregorianCalendar;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		CalDay CalDay = new CalDay();
		CalDay.valid = false;
		CalDay.isValid();
		CalDay.iterator();
		assertFalse(CalDay.valid);
	 }

	 @Test
    public void CalDayTest1()  throws Throwable  {
         GregorianCalendar today = new GregorianCalendar(2017,4,29);
	     assertTrue(new CalDay(today).valid);
     }

     @Test
    public void addApptTest()  throws Throwable  {
        GregorianCalendar today = new GregorianCalendar(2017,5,1);
        Appt temp_1 = new Appt(5,7,9,1,2016,null, null);
        Appt temp_2 = new Appt(4,7,5,3,2016,null, null);
        Appt temp_3 = new Appt(1,1,1,4,2016,null, null);
        CalDay temp = new CalDay(today);
        temp.addAppt(temp_1);
        temp.addAppt(temp_2);
        temp.addAppt(temp_3);
        assertTrue(new CalDay(today).valid);
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

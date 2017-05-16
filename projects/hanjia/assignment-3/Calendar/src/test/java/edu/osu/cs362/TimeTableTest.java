package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		 TimeTable test = new TimeTable();
		 GregorianCalendar today = new GregorianCalendar(2017,5,1);
		 Appt temp_1 = new Appt(1,1,1,5,2017,null, null);
		 Appt temp_2 = new Appt(2,1,1,5,2017,null, null);
		 Appt temp_3 = new Appt(13,1,1,5,2017,null, null);
		 Appt temp_4 = new Appt(15,1,1,5,2017,null, null);
		 Appt temp_5 = new Appt(-1,1,1,5,2017,null, null);
		 CalDay cal = new CalDay(today);
		 cal.addAppt(temp_1);

		 LinkedList<Appt> appts = new LinkedList<Appt>();
		 LinkedList<Appt> nah = new LinkedList<Appt>();
		 appts.add(temp_1);
		 appts.add(temp_2);
		 appts.add(temp_3);
		 nah.add(temp_5);

		 GregorianCalendar tmr = (GregorianCalendar)today.clone();
		 tmr.add(Calendar.DAY_OF_MONTH,1);
		 assertFalse(test.getApptRange(appts, today, tmr) == null);
		 assertFalse(test.getApptRange(nah, today, tmr) == null);
		 assertFalse(test.deleteAppt(appts, temp_1) == null);

		 assertEquals(null, test.deleteAppt(appts, temp_4));
		 assertEquals(null, test.deleteAppt(nah, temp_1));
		 assertEquals(null, test.deleteAppt(null,temp_1));
		 assertEquals(null, test.deleteAppt(appts, null));
		 GregorianCalendar delete= (GregorianCalendar)today.clone();

		 GregorianCalendar someday = new GregorianCalendar(2017,5,15);
		 test.getApptRange(appts, today, someday);

	 }

	 @Test
	public void deleteApptTest()  throws Throwable  {
		 TimeTable test = new TimeTable();
		 GregorianCalendar today = new GregorianCalendar(2017,5,1);
		 GregorianCalendar tmr = new GregorianCalendar(2017,5,2);
		 Appt temp_1 = new Appt(1,1,1,5,2017,null, null);
		 Appt temp_2 = new Appt(2,1,1,5,2017,null, null);
		 Appt temp_3 = new Appt(13,1,1,5,2017,null, null);
		 LinkedList<Appt> appts = new LinkedList<Appt>();

		 test.deleteAppt(null,temp_1);

		 appts.add(temp_1);
		 appts.add(temp_2);
		 appts.add(temp_3);

		 test.deleteAppt(appts,temp_1);
		 assertNotNull(appts);
	 }

}

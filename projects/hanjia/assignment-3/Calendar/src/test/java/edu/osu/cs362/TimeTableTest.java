package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import static org.junit.Assert.assertNotNull;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		 TimeTable test = new TimeTable();
		 GregorianCalendar today = new GregorianCalendar(2017,5,1);
		 GregorianCalendar tmr = new GregorianCalendar(2017,5,9);
		 Appt temp_1 = new Appt(5,7,1,5,2017,null, null);
		 Appt temp_2 = new Appt(4,7,9,5,2017,null, null);
		 Appt temp_3 = new Appt(1,1,1,4,2016,null, null);
		 LinkedList<Appt> appts = new LinkedList<Appt>();

		 appts.add(temp_1);
		 appts.add(temp_2);
		 appts.add(temp_3);

		 LinkedList<CalDay> cd = test.getApptRange(appts, today, tmr);

		 assertNotNull(cd);

	 }

	 @Test
	public void deleteApptTest()  throws Throwable  {
		 TimeTable test = new TimeTable();
		 GregorianCalendar today = new GregorianCalendar(2017,5,1);
		 GregorianCalendar tmr = new GregorianCalendar(2017,5,9);
		 Appt temp_1 = new Appt(5,7,1,5,2017,null, null);
		 Appt temp_2 = new Appt(4,7,9,5,2017,null, null);
		 Appt temp_3 = new Appt(1,1,1,4,2016,null, null);
		 LinkedList<Appt> appts = new LinkedList<Appt>();

		 test.deleteAppt(null,temp_1);

		 appts.add(temp_1);
		 appts.add(temp_2);
		 appts.add(temp_3);

		 test.deleteAppt(appts,temp_1);
		 assertNotNull(appts);
	 }

}

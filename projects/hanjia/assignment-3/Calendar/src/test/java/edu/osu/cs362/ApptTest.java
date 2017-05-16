package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import com.google.common.annotations.VisibleForTesting;
import org.evosuite.shaded.org.mockito.Mockito;
import org.junit.Test;

import java.lang.reflect.Method;

import static com.sun.javaws.JnlpxArgs.verify;
import static org.evosuite.shaded.org.mockito.Mockito.mock;
import static org.evosuite.shaded.org.mockito.Mockito.times;
import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 appt.isValid();
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
	 }

	@Test
	public void isvalidtest1() throws Throwable {
		int startHour= 1;
		int startMinute=1;
		int startDay=1;
		int startMonth=1;
		int startYear=2017;
		boolean test;
		String title= null;
		String description= null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.isValid();
		if(startHour<0 || startHour > 23)
			test = false;
		else
			test = true;

		// assertions
		assertEquals(test, appt.getValid());
		assertEquals("",appt.getDescription());
		assertEquals("",appt.getTitle());
		//startHour boundary
		appt.setStartHour(-1);
		assertEquals(false,appt.getValid());
		appt.setStartHour(0);
		assertEquals(true,appt.getValid());
		appt.setStartHour(12);
		assertEquals(true, appt.getValid());
		appt.setStartHour(24);
		assertEquals(false, appt.getValid());
		assertEquals(null, appt.toString());
		appt.setStartHour(23);
		assertEquals(true, appt.getValid());


		//startmin boundary
		appt.setStartMinute(-1);
		assertEquals(false,appt.getValid());
		appt.setStartMinute(0);
		assertEquals(true,appt.getValid());
		appt.setStartMinute(30);
		assertEquals(true, appt.getValid());
		appt.setStartMinute(60);
		assertEquals(false, appt.getValid());
		appt.setStartMinute(59);
		assertEquals(true, appt.getValid());

		//startday boundary
		appt.setStartDay(0);
		assertEquals(false,appt.getValid());
		appt.setStartDay(1);
		assertEquals(true,appt.getValid());
		appt.setStartDay(15);
		assertEquals(true, appt.getValid());
		appt.setStartDay(32);
		assertEquals(false, appt.getValid());
		appt.setStartDay(31);
		assertEquals(true, appt.getValid());

		//startMonth boundary
		appt.setStartMonth(0);
		assertEquals(false,appt.getValid());
		appt.setStartMonth(1);
		assertEquals(true,appt.getValid());
		appt.setStartMonth(6);
		assertEquals(true, appt.getValid());
		appt.setStartMonth(13);
		assertEquals(false, appt.getValid());
		appt.setStartMonth(12);
		assertEquals(true, appt.getValid());

		//startYear isvalid
		appt.setStartYear(1234);
		assertEquals(true,appt.getValid());

		//toString boundary
		appt.setStartHour(0);
		assertEquals("\t12/31/1234 at 12:59am ,, \n", appt.toString());
		appt.setStartHour(11);
		assertEquals("\t12/31/1234 at 11:59am ,, \n", appt.toString());
		appt.setStartHour(12);
		assertEquals("\t12/31/1234 at 12:59pm ,, \n", appt.toString());
		appt.setStartHour(13);
		assertEquals("\t12/31/1234 at 1:59pm ,, \n", appt.toString());
	}

	@Test
	public void toStringtest()  throws Throwable  {
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.toString();

		assertNotEquals(null,appt.toString());
	}

	@Test
	public void toStringtest1()  throws Throwable  {
		int startHour=25;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.toString();

		assertEquals(null,appt.toString());
	}


	@Test
	public void toStringtest2()  throws Throwable  {
		int startHour=12;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.toString();

		assertNotNull(appt.toString());
	}

}

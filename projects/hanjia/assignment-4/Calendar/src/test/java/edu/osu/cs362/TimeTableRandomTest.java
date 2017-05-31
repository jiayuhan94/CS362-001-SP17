package edu.osu.cs362;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;


/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
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
     * Generate Random Tests that tests TimeTable Class.
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

				 TimeTable tim = new TimeTable();
				 LinkedList<Appt> lin = cal.getAppts();
				 tim.deleteAppt(lin, appt);

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


				 Integer temp = ValuesGenerator.getRandomIntBetween(random, 0, 3);
				 LinkedList<Appt> lin1 = cal.getAppts();

				 if(temp == 0){
					 tim.deleteAppt(null, null);
				 }else if(temp == 1){
					 tim.deleteAppt(null, appt);
				 }else if (temp ==2){
					 tim.deleteAppt(lin1, null);
				 }else {
					 tim.deleteAppt(lin1, appt);
				 }
			 }

			 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			 if((iteration%10000)==0 && iteration!=0 )
				 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

		 }
		 System.out.println("Done testing...");
	 }
}

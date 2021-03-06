/*
 * This file was automatically generated by EvoSuite
 * Wed May 31 05:09:19 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.osu.cs362.Appt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Appt_ESTest extends Appt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(0, 31, 31, 0, 31, "javax.xml.datatype.Duration#isSet(DatatypeConstants.Field field) ", "javax.xml.datatype.Duration#isSet(DatatypeConstants.Field field) ");
      assertEquals(31, appt0.getStartMinute());
      assertEquals(0, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(31, appt0.getStartDay());
      assertEquals(31, appt0.getStartYear());
      assertEquals("javax.xml.datatype.Duration#isSet(DatatypeConstants.Field field) ", appt0.getTitle());
      assertEquals("javax.xml.datatype.Duration#isSet(DatatypeConstants.Field field) ", appt0.getDescription());
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(1419, 271, 1419, 0, 0, "'[qZCc1@N5:p_", "'[qZCc1@N5:p_");
      boolean boolean0 = appt0.getValid();
      assertEquals(271, appt0.getStartMinute());
      assertEquals("'[qZCc1@N5:p_", appt0.getTitle());
      assertEquals(1419, appt0.getStartHour());
      assertEquals("'[qZCc1@N5:p_", appt0.getDescription());
      assertFalse(boolean0);
      assertEquals(1419, appt0.getStartDay());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt0 = new Appt(669, 669, 57, 57, 669, "", "");
      appt0.getTitle();
      assertFalse(appt0.getValid());
      assertEquals(57, appt0.getStartDay());
      assertEquals(669, appt0.getStartYear());
      assertEquals(57, appt0.getStartMonth());
      assertEquals(669, appt0.getStartHour());
      assertEquals(669, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Appt appt0 = new Appt(13, (-1284), (-1284), 13, 13, "Iva?idXGCV[lue-fractional", "Iva?idXGCV[lue-fractional");
      int int0 = appt0.getStartYear();
      assertEquals(13, int0);
      assertEquals(-1284, appt0.getStartMinute());
      assertEquals(13, appt0.getStartHour());
      assertEquals(-1284, appt0.getStartDay());
      assertEquals("Iva?idXGCV[lue-fractional", appt0.getTitle());
      assertEquals(13, appt0.getStartMonth());
      assertEquals("Iva?idXGCV[lue-fractional", appt0.getDescription());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Appt appt0 = new Appt((-481), (-481), (-481), (-481), (-481), "$SR6g.A__u<2o\"g*Sn", "$SR6g.A__u<2o\"g*Sn");
      int int0 = appt0.getStartYear();
      assertEquals(-481, appt0.getStartMinute());
      assertEquals(-481, appt0.getStartMonth());
      assertEquals(-481, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals("$SR6g.A__u<2o\"g*Sn", appt0.getDescription());
      assertEquals("$SR6g.A__u<2o\"g*Sn", appt0.getTitle());
      assertEquals((-481), int0);
      assertEquals(-481, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt0 = new Appt((-1420), (-1420), (-1420), (-1420), 2181, "InvalidXGCValue-fractional", "");
      int int0 = appt0.getStartMonth();
      assertEquals((-1420), int0);
      assertEquals(-1420, appt0.getStartDay());
      assertEquals(-1420, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals("InvalidXGCValue-fractional", appt0.getTitle());
      assertEquals("", appt0.getDescription());
      assertEquals(-1420, appt0.getStartHour());
      assertEquals(2181, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt0 = new Appt(3973, 0, 3973, 0, 3973, (String) null, (String) null);
      int int0 = appt0.getStartMinute();
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartMonth());
      assertEquals(3973, appt0.getStartHour());
      assertEquals(3973, appt0.getStartYear());
      assertEquals(3973, appt0.getStartDay());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt0 = new Appt(0, 1000000000, 0, 0, 0, "nyMRsCE2B|;W", "\t");
      int int0 = appt0.getStartHour();
      assertEquals("\t", appt0.getDescription());
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartDay());
      assertEquals(1000000000, appt0.getStartMinute());
      assertEquals(0, appt0.getStartYear());
      assertEquals("nyMRsCE2B|;W", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt0 = new Appt(142, 11, 142, 142, 11, "1n9'jgC", ";<5h18%");
      int int0 = appt0.getStartHour();
      assertEquals(142, appt0.getStartDay());
      assertEquals("1n9'jgC", appt0.getTitle());
      assertEquals(142, int0);
      assertEquals(142, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(11, appt0.getStartYear());
      assertEquals(11, appt0.getStartMinute());
      assertEquals(";<5h18%", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt0 = new Appt((-2375), (-2375), 0, (-2375), 0, "MLX6'7pr6:=!VF!L", "MLX6'7pr6:=!VF!L");
      int int0 = appt0.getStartDay();
      assertEquals(0, appt0.getStartYear());
      assertEquals("MLX6'7pr6:=!VF!L", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(-2375, appt0.getStartMonth());
      assertEquals(0, int0);
      assertEquals(-2375, appt0.getStartHour());
      assertEquals("MLX6'7pr6:=!VF!L", appt0.getDescription());
      assertEquals(-2375, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt0 = new Appt((-87), 0, 2651, 2651, 0, "YMD", "G@-(y*FOF");
      int int0 = appt0.getStartDay();
      assertEquals(2651, int0);
      assertEquals(-87, appt0.getStartHour());
      assertEquals("G@-(y*FOF", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals("YMD", appt0.getTitle());
      assertEquals(2651, appt0.getStartMonth());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Appt appt0 = new Appt(2813, 2813, 2813, 2813, 2813, (String) null, (String) null);
      String string0 = appt0.getDescription();
      assertEquals(2813, appt0.getStartMinute());
      assertEquals(2813, appt0.getStartYear());
      assertEquals(2813, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(2813, appt0.getStartDay());
      assertEquals(2813, appt0.getStartMonth());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Appt appt0 = new Appt(0, 1000000000, 0, 0, 0, "nyMRsCE2B|;W", "\t");
      appt0.setDescription("\t");
      assertEquals(0, appt0.getStartHour());
      assertEquals(1000000000, appt0.getStartMinute());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals("\t", appt0.getDescription());
      assertEquals("nyMRsCE2B|;W", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Appt appt0 = new Appt(13, (-1284), (-1284), 13, 13, "Iva?idXGCV[lue-fractional", "Iva?idXGCV[lue-fractional");
      assertEquals("Iva?idXGCV[lue-fractional", appt0.getDescription());
      
      appt0.setDescription((String) null);
      assertEquals(-1284, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Appt appt0 = new Appt((-460), (-460), (-460), (-460), (-460), "", "#(>xoyOeV!OCnjV\"J");
      appt0.setTitle("Minute");
      assertEquals("Minute", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Appt appt0 = new Appt(13, (-1284), (-1284), 13, 13, "Iva?idXGCV[lue-fractional", "Iva?idXGCV[lue-fractional");
      assertEquals("Iva?idXGCV[lue-fractional", appt0.getTitle());
      
      appt0.setTitle((String) null);
      assertEquals(13, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Appt appt0 = new Appt((-335), (-335), (-335), (-335), (-335), "s6SO)]uQro#:-", "s6SO)]uQro#:-");
      String string0 = appt0.getTitle();
      assertEquals(-335, appt0.getStartDay());
      assertEquals(-335, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(-335, appt0.getStartMonth());
      assertEquals(-335, appt0.getStartHour());
      assertEquals("s6SO)]uQro#:-", string0);
      assertEquals(-335, appt0.getStartMinute());
      assertEquals("s6SO)]uQro#:-", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Appt appt0 = new Appt((-1), (-1), (-1), (-1), (-1597), "Nl;]R_)z1Qn2g1Q1TF", "Nl;]R_)z1Qn2g1Q1TF");
      int int0 = appt0.getStartDay();
      assertEquals(-1, appt0.getStartMinute());
      assertEquals(-1, appt0.getStartMonth());
      assertEquals((-1), int0);
      assertEquals(-1597, appt0.getStartYear());
      assertEquals("Nl;]R_)z1Qn2g1Q1TF", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals(-1, appt0.getStartHour());
      assertEquals("Nl;]R_)z1Qn2g1Q1TF", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "\n", "\n");
      boolean boolean0 = appt0.getValid();
      assertEquals(11, appt0.getStartYear());
      assertEquals(11, appt0.getStartHour());
      assertEquals("\n", appt0.getDescription());
      assertTrue(boolean0);
      assertEquals(11, appt0.getStartMonth());
      assertEquals(11, appt0.getStartMinute());
      assertEquals(11, appt0.getStartDay());
      assertEquals("\n", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Appt appt0 = new Appt((-1638), 1907, (-1638), (-1987), 2902, "", "");
      int int0 = appt0.getStartHour();
      assertFalse(appt0.getValid());
      assertEquals(1907, appt0.getStartMinute());
      assertEquals((-1638), int0);
      assertEquals(-1987, appt0.getStartMonth());
      assertEquals(2902, appt0.getStartYear());
      assertEquals(-1638, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Appt appt0 = new Appt((-2375), (-2375), 0, (-2375), 0, "MLX6'7pr6:=!VF!L", "MLX6'7pr6:=!VF!L");
      int int0 = appt0.getStartYear();
      assertEquals(0, appt0.getStartDay());
      assertEquals(-2375, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(-2375, appt0.getStartMinute());
      assertEquals("MLX6'7pr6:=!VF!L", appt0.getDescription());
      assertEquals("MLX6'7pr6:=!VF!L", appt0.getTitle());
      assertEquals(0, int0);
      assertEquals(-2375, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "\n", "\n");
      String string0 = appt0.getDescription();
      assertEquals("\n", string0);
      assertEquals(11, appt0.getStartMonth());
      assertEquals(11, appt0.getStartHour());
      assertTrue(appt0.getValid());
      assertEquals(11, appt0.getStartYear());
      assertEquals(11, appt0.getStartDay());
      assertEquals(11, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Appt appt0 = new Appt(12, 71, 12, 12, 12, "]J!n", "]J!n");
      assertEquals(71, appt0.getStartMinute());
      
      appt0.setStartMinute(12);
      String string0 = appt0.toString();
      assertEquals("\t12/12/12 at 12:12pm ,]J!n, ]J!n\n", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Appt appt0 = new Appt(3973, (-36), 3973, (-36), 3973, (String) null, (String) null);
      int int0 = appt0.getStartMinute();
      assertEquals(3973, appt0.getStartYear());
      assertEquals(3973, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals((-36), int0);
      assertEquals(-36, appt0.getStartMonth());
      assertEquals(3973, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Appt appt0 = new Appt(13, (-1284), (-1284), 13, 13, "Iva?idXGCV[lue-fractional", "Iva?idXGCV[lue-fractional");
      appt0.setStartMinute(13);
      assertEquals(-1284, appt0.getStartDay());
      
      appt0.setStartDay(13);
      assertEquals(13, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "\n", "\n");
      appt0.setStartMonth((-669));
      assertEquals(-669, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Appt appt0 = new Appt(0, 59, 59, 59, 0, "'[qZCc1@N5:p_", "*c\"v");
      assertFalse(appt0.getValid());
      assertEquals(59, appt0.getStartDay());
      assertEquals(59, appt0.getStartMinute());
      assertEquals("*c\"v", appt0.getDescription());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartYear());
      assertEquals(59, appt0.getStartMonth());
      assertEquals("'[qZCc1@N5:p_", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "KW+)[", "KW+)[");
      int int0 = appt0.getStartMonth();
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartYear());
      assertEquals("KW+)[", appt0.getTitle());
      assertEquals("KW+)[", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Appt appt0 = new Appt(1, 1180, 1180, 1180, 1, "#getXMLSchemaType() :", "C");
      int int0 = appt0.getStartMonth();
      assertEquals(1, appt0.getStartHour());
      assertEquals(1180, appt0.getStartDay());
      assertEquals(1, appt0.getStartYear());
      assertEquals(1180, int0);
      assertEquals("C", appt0.getDescription());
      assertEquals(1180, appt0.getStartMinute());
      assertEquals("#getXMLSchemaType() :", appt0.getTitle());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Appt appt0 = new Appt(23, (-2529), 1, (-743), 0, "[", "[");
      String string0 = appt0.toString();
      assertEquals(-2529, appt0.getStartMinute());
      assertEquals(0, appt0.getStartYear());
      assertEquals("[", appt0.getTitle());
      assertEquals(23, appt0.getStartHour());
      assertNull(string0);
      assertEquals("[", appt0.getDescription());
      assertEquals(-743, appt0.getStartMonth());
      assertEquals(1, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Appt appt0 = new Appt(2000, 2000, 2000, 2743, 58, "N$x0w.?l|Z/>", "");
      int int0 = appt0.getStartMinute();
      assertEquals(2000, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(2000, int0);
      assertEquals("N$x0w.?l|Z/>", appt0.getTitle());
      assertEquals(58, appt0.getStartYear());
      assertEquals(2743, appt0.getStartMonth());
      assertEquals("", appt0.getDescription());
      assertEquals(2000, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "\n", "\n");
      appt0.setStartYear(0);
      assertEquals(0, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "\n", "\n");
      appt0.setStartHour(0);
      appt0.toString();
      assertEquals(0, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "\n", "\n");
      String string0 = appt0.toString();
      assertEquals("\t11/11/11 at 11:11am ,\n, \n\n", string0);
      assertNotNull(string0);
  }
}

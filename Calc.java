// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// See CalcTest.java, DataDrivenCalcTest.java for JUnit tests

public class Calc
{
   static public int add (int one, int two)
   {
      return one + two;
   }
   
   static public int subtract(int one, int two){
	   return one - two;
   }
   
   static public int multiply(int one, int two){
	   return one * two;
   }
   
   static public int divide(int numerator, int denominator){
	   return numerator / denominator;
   }
}
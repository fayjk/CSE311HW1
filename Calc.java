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
   
   static public int multiply(int productOne, int productTwo){
	   return productOne * productTwo;
   }
   
   static public float divide(float numerator, float denominator){
	   return numerator/denominator;
   }
}
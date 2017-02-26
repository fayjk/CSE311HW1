// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// See CalcTest.java, DataDrivenCalcTest.java for JUnit tests

public class Calc
{
   static public float add (float one, float two)
   {
      return one + two;
   }
   
   static public float subtract(float one, float two){
	   return one - two;
   }
   
   static public float multiply(float one, float two){
	   return one * two;
   }
   
   static public float divide(float numerator, float denominator){
	   return numerator / denominator;
   }
}
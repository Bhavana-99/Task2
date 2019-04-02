/**
 * 
 * @author A.Bhavana Goud
 *
 */



public class Calci {

	 long add_numbers(int num1,int num2)
	 {
		 return num1+num2;  // return the sum of two numbers given.
	 }
	 
	 long multiply_numbers(int num1,int num2)
	 {
		 return num1*num2; //return product of two numbers provided.
	 }
	 
	  int divide_numbers(int num1,int num2)
	  {
		  int quotient=0;
		  try {  
	  
		  quotient= num1/num2;  // if the divisor is 0 which cannot be used as a divisor an exception is raised. 
		      }
		  catch(Exception e)  // catches the exception raised and handles it 
		  {
			  e.printStackTrace();
		  }
		  return quotient;
	  }
}

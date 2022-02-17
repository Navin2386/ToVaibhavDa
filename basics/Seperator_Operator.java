package basics;

public class Seperator_Operator {

	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		int a = 10;
		int b = 20;
		int sum = a+b;                        //Separator seperates the non similar data type
		System.out.println("Sum  ="+sum);    //while operator does arithmatic operation in 
		System.out.println(a+b);             //two similar data types
		System.out.println("sum = "+a+b);
		System.out.println(a+b+" =  sum");
		
		//requirement addition of 10 and 20 =30
		//"addition of "+a + "and" + b+ "=" + (a+b)
		System.out.println("addition of "+a+" and "+b+" = "+sum);
		System.out.println("addition of "+a+" and "+b+" = "+(a+b));
		System.out.println("**Program Ends**");
		

	}
  
}

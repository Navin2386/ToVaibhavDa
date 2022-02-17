package callingMethods;

public class Ex4 {
	public static int a=10,b=20;
	public static void main(String[] args) {
		System.out.println("**Program starts**");
		test1();
		test2();
		//System.out.println("a = "+a);
		//System.out.println("b = "+b);
		System.out.println("**Program Ends**");
	}
	public static void test1() {
		System.out.println("Test 1");
		System.out.println("a = "+Ex4.a);      //standard way
		System.out.println("b = "+Ex4.b);     //standard way
	}
public static void test2() {
	System.out.println("Test 2");
	//test1();        //1st way
	Ex4.test1();   //2nd way
	//Ex4 obj = new Ex4();
	//obj.test1();     //3rd way
}
}

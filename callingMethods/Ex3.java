package callingMethods;

public class Ex3 {
	int a=10,b=20;
	public void test1() {
		System.out.println("Test 1 - Starts");
		System.out.println("Test 1");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("this.a = "+this.a);
		System.out.println("this.b = "+this.b);
		this.test2();
		Ex3 obj = new Ex3();
		System.out.println("obj.a = "+obj.a);
		System.out.println("obj.b = "+obj.b);
		test2();
		obj.test2();
		System.out.println("Test 1 - ends");
	}

	public void test2() {
		System.out.println("Test 2");
	}
	public static void main(String[] args) {
	System.out.println("**Program starts**");
	Ex3 obj = new Ex3();
	obj.test1();
	System.out.println("Program Ends");
	}

}

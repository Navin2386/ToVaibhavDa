package callingMethods;

public class Ex2 {
	int a=10,b=20;
	public void test1() {
		System.out.println("Test 1");
	}
	public void test2() {
		System.out.println("Test 2");
	}

	public static void main(String[] args) {
		Ex2 obj1 = new Ex2();
		Ex2 obj2 = new Ex2();
		Ex2 obj3 = new Ex2();
		System.out.println("**Before Update");
		System.out.println("obj1.a"+obj1.a);
		System.out.println("obj2.a"+obj2.a);
		System.out.println("obj3.a"+obj3.a);
		
		obj1.a = 50;
		obj2.a = 60;
		obj3.a = 70;
		System.out.println("**After Update");
		System.out.println("obj1.a"+obj1.a);
		System.out.println("obj2.a"+obj2.a);
		System.out.println("obj3.a"+obj3.a);
		
	
	Ex2 obj4 = new Ex2();
	System.out.println("obj4.a"+obj4.a);
	System.out.println("obj1 calling methods : ");
	obj1.test1();
	obj1.test2();
	System.out.println("obj2 calling methods : ");
	obj2.test1();
	obj2.test2();
	System.out.println("obj3 calling methods : ");
	obj3.test1();
	obj3.test2();
	System.out.println("obj4 calling methods : ");
	obj4.test1();
	obj4.test2();
	}


}

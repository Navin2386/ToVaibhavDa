package callingMethods;

public class Ex1 {
	//int x = 10; 
	//float f = 44.44f;
	public void addition () {
		int a = 50,b = 60;
		int sum = a+b;
		System.out.println("Addition = "+ sum);
	}
	public void Substraction () {
		int a = 100,b = 20;
		int sub = a-b;
		System.out.println("Substraction = "+ sub);
	}

	public static void main(String[] args) {
		System.out.println("**Program Starts**");
		Ex1 obj1 = new Ex1();
		obj1.addition();
		obj1.Substraction();
		obj1.Multipliction();
		obj1.Division();
		System.out.println("**Program Ends**");

	}
	public void Multipliction () {
		int a = 10,b = 20;
		int mul = a*b;
		System.out.println("Multipliction = "+ mul);
	}
	public void Division () {
		int a = 10,b = 2;
		int div = a/b;
		System.out.println("Division = "+ div);
	}

}

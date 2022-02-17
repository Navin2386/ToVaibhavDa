package basics;

public class Global_Variables_Declare_Only {
	//Global Variables
	byte b = 10;
	short s = 50;
	long l = 10;
	float f = 8800.21f;
	double d = 77644.44;
	char c = 'A';
	boolean b1 = true;
	
	public static void main(String[] args) {
	System.out.println("**Program Stars**");
	Global_Variables_Declare_Only obj1 = new Global_Variables_Declare_Only();
	System.out.println("byte b = "+obj1.b);
	System.out.println("short s= "+obj1.s);
	System.out.println("long l= "+obj1.l);
	System.out.println("float f = "+obj1.f);
	System.out.println("double d= "+obj1.d);
	System.out.println("char c = "+obj1.c);
	System.out.println("boolean b = "+obj1.b);

	}

}

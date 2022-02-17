package basics;

public class Global_Variables {
	//Global Variables
	//Declared only java will inilialize the values to default values.
	byte b;        //00
	short s;       //00
	long l;        //00
	float f;       //00.00
	double d;      //00.00
	char c;        //Special char/blank
	boolean b1;    //false
	
	public static void main(String[] args) {
	System.out.println("**Program Stars**");
	Global_Variables obj1 = new Global_Variables();
	System.out.println("byte b = "+obj1.b);
	System.out.println("short s= "+obj1.s);
	System.out.println("long l= "+obj1.l);
	System.out.println("float f = "+obj1.f);
	System.out.println("double d= "+obj1.d);
	System.out.println("char c = "+obj1.c);
	System.out.println("boolean b = "+obj1.b);

	}

}

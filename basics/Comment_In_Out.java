package basics;

public class Comment_In_Out {

	public static void main(String[] args) {
		
		
//		  int a = 60;               //For single line comment press ctrl+/ and to remove press same 
//		  int b = 30;               //For multiple line command press ctrl+shift+/ to remove press ctrl +shift+\           
//		  int sum = a+b;
//		  int mul = a*b;
//		  int div = a/b;
//		  int sub = a-b; 
//		  System.out.println(sum);
//		  System.out.println(mul);
//		  System.out.println(div); 
//		  System.out.println(sub);
//		  System.out.println();
//		  System.out.println();
		 
		Arithmatic_Programs obj1=new Arithmatic_Programs();
		obj1.datatypes(); 
		System.out.println(obj1);


	}
//Data Types 
	public void datatypes() {
		byte a = 10;
		int b =25;
		long L = 78524;
		float f = 45.23f;
		double d = 14.5624852;
		char C=  'N';
		System.out.println("byte"  +a);
		System.out.println("int"  +b);
		System.out.println("long"  +L);
		System.out.println("float"  +f);
		System.out.println("double"  +d);
		System.out.println("char   "  + C);
		
	}
}




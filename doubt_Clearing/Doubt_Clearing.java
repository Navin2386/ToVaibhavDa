package doubt_Clearing;

public class Doubt_Clearing {

	public static void main(String[] args) {
		Doubt_Clearing obj1 = new Doubt_Clearing ();
		obj1.ram ();	
	}
	public void ram() {
		float Marks = 62f;
		if(Marks>=66) {
			System.out.println("Passes with dist.");	
		}
		else if (Marks >=50 && Marks<=66) {
			System.out.println("passed with 1st class");
		}
		else if (Marks >=35 && Marks<=50) {
			System.out.println("passed with 2st class");
		}
		else {
			System.out.println("Try hard you got failed");
		}
		
			
	}

}

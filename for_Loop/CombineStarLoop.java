package for_Loop;

public class CombineStarLoop {

	public static void main(String[] args) {
		
		CombineStarLoop obj1 = new CombineStarLoop ();	
		obj1.Ex1();
		obj1.Ex2();
		System.out.println(obj1);
	}	

		public void Ex1() { 
		for(int i=5;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		}

public void Ex2() {
		for(int i=5-1;i>=1;i--) {
			for (int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		}
	}




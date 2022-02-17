package for_Loop;

public class ForLoop {

	public static void main(String[] args) {

		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++) {
				System.out.print(" "+i);
			}
			System.out.println();}
		
			System.out.println(); 
		for(int i=1;i<=3;i++){ 
			for(int j=1;j<=3;j++){
				System.out.print(" "+j);
			} 
			System.out.println();}
		System.out.println();
		


		for(int i=3;i>=1;i--){
			for(int j=3;j>=1;j--) {
				System.out.print(" "+j);}
			System.out.println();
		}

		System.out.println();
		for(int i=3;i>=1;i--){
			for(int j=3;j>=1;j--) {System.out.print(" "+i);}
			System.out.println();}
		System.out.println();

		for(int i=11;i<=13;i++){
			for(int j=11;j<=13;j++) {
				System.out.print(" "+j);
			}
			System.out.println();}
		System.out.println();

		for(int i=11;i<=33;i=i+11) {
			for(int j=11; j<=33;j=j+11) {

				System.out.print(" "+j);
			}
			System.out.println();
		}




	}
}


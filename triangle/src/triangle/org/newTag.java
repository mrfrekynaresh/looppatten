package triangle.org;

public class newTag {

	public static void main(String[] args) {

		for(int i=1;i<=4;i++) {
		for(int j=3;j>=i;j--) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		for(int j=1;j<i;j++) {
			System.out.print("*");
			
			
		}
		System.out.println();
		}
	}

}

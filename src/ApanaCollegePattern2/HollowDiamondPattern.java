package ApanaCollegePattern2;

public class HollowDiamondPattern {

	public static void main(String[] args) {

		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			System.out.print("*");
			
			if(i!=0)
			{
				for (int j = 1; j <= 2*i-1; j++) {
					System.out.print("  ");
				}
				System.out.print("*");
			}
				

		}
		System.out.println();
	}

}

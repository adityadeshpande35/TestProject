package ApanaCollegePattern2;

public class TrianglePatternWithAlpha2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			int alpha=64;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(alpha+j)+" ");
				
				}
			
			System.out.println();	
		}
		
		}
	
}

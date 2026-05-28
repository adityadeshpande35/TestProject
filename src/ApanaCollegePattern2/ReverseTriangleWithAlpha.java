package ApanaCollegePattern2;

public class ReverseTriangleWithAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			char ch=(char)('A' + i-1);
			for(int j=i;j>=1;j--)
			{
				System.out.print(ch+" ");
				ch--;
				
				}
			System.out.println();	
	
	}

}
}

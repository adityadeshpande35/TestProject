package pckgstarpattern;

public class Pattern9star {
	public static void main(String[] args) {
		
		for(int i=0;i<3;i++)
		{
	
			for(int j=0;j<3-i-1;j++)
	{
				System.out.print(" ");
	}
			for(int j=0;j<2*i+1;j++)
			{
						System.out.print("*");
			}
			
			for(int j=0;j<3-i-1;j++)
			{
						System.out.print(" ");
			}
			System.out.println();
		}
}
		}

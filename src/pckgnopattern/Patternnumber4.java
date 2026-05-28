package pckgnopattern;

public class Patternnumber4 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			 int num = 2 * i -1; // Calculate the number to print
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
			}
			System.out.println("");
		}
	}
}

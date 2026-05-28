package pckgnumber;

import java.util.Scanner;

public class Paterson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int fact[]= {1,1,2,6,24,120,720,5040,40320,362880};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			sum=sum+fact[d];
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("is peterson");
		}
		else
		{
		System.out.println("is not a peterson");
		}
}
	}



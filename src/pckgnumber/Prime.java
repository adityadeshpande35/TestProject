package pckgnumber;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter the number");
		num=sc.nextInt();
		int temp=0;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
	if(temp>0)
	{
		System.out.println("Number is not prime");
	}
	else
	{
		System.out.println("Number is prime");
	}
	}

}

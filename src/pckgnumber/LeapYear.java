package pckgnumber;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int year;
		System.out.println("enter the year");
		year=in.nextInt();
		if (((year%4 ==0) && (year%100!= 0)) || (year%400== 0))
				System.out.println("particular year is leap year");
		else
			System.out.println("particular year is not leap year");
	}

}

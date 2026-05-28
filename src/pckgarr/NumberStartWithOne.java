package pckgarr;

import java.util.ArrayList;
import java.util.List;

public class NumberStartWithOne {
	
	
	public static int getFirstDigit(int num)
	{
		while(num>=10)
		{
			num=num/10;
		}
		return num;
	}
	
	public static List<Integer> getNumberList(int arr[])
	{
		List<Integer> numbers=new ArrayList<Integer>();
		for(int num:arr)
		{
			int n=getFirstDigit(num);
			if(n == 1)
			{
				numbers.add(num);
			}
		}
		return numbers;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,23,123,45,67,167};
      System.out.println(getNumberList(arr));
      
	}

}

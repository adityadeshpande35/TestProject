package pckgstr;

public class ReverseString2 {
	
	
	public static void makeReverse(String str)
	{
	String a[]=str.split(" ");
	   StringBuilder reversedString = new StringBuilder();
	for(int i=a.length-1;i>=0;i--)
	{
		reversedString.append(a[i]).append(" ");
		
	}
 System.out.println(reversedString.toString().trim());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome to java";
		makeReverse(str);
	}

}

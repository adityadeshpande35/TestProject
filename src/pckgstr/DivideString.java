package pckgstr;

public class DivideString {

	public static void divideStringInEqualPart(String str) {
		// TODO Auto-generated method stub
		
		int len=str.length();
		int temp=0;
		int n=4;
		int chars=len/n;
		
	String []equalStr=new String[n];
	
	if(len%n!=0)
	{
		System.out.println("The string cannot be divided into n equal parts");
		
	}
	else
	{
		for(int i=0;i<len;i=i+chars)
		{
			String part=str.substring(i,i+chars);
			equalStr[temp]=part;
			temp++;
		 }
			System.out.println(n + " equal parts of given string are ");  
            for(int j = 0; j < equalStr.length; j++) {  
                System.out.println(equalStr[j]);  
			
           
		}
	}
	
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	String str="aaaabbbbcccc";
		String str="STAYHOMESTAYSAFE";
		
		divideStringInEqualPart(str);
	}

	

}

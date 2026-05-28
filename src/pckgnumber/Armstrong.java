package pckgnumber;

public class Armstrong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int sum=0,r,temp;
	
	int n=153;
	 temp=n;
	 while(n>0)
	 {
		 r=n%10;
		 n=n/10;
		 sum=sum+(r*r*r);
	 }
	 if(temp==sum)
		 System.out.println("armstrong number");
	else
	
		System.out.println("Not armstrong number");

	}
}

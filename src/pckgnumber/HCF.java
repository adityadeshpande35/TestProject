package pckgnumber;

public class HCF {

	public static int gcd(int m,int n)
	{
		while(m!=n)
		{
			if(m>n)
				m=m-n;
			else
				n=n-m;
			
		}
		return m;
	}

	public static int calculateLCM(int m, int n) {
        return (m * n) / gcd(m, n);
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(gcd(35,56));

System.out.println(calculateLCM(35,56));
}
}

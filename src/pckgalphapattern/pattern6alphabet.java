package pckgalphapattern;

public class pattern6alphabet {
	public static void main(String[] args) {
	 int n = 5;


     //upper part
     for(int i=1; i<=n; i++) {
         //spaces
         for(int j=1; j<=n-i; j++) {
             System.out.print(" ");
         }
         char ch='A';
         int breakpoint=(2*i+1)/2;
         for(int j=1; j<=2*i+1; j++) {
             System.out.print(ch);
             if(j<=breakpoint)
            	 ch++;
             else
            	 ch--;
         }
         System.out.println();
     }
}
}

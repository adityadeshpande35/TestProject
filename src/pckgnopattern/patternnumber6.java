package pckgnopattern;
public class patternnumber6 {
     
	public static void main(String args[])
    {
        
          
        for (int i = 0; i <=5; i++)
        {
            for (int j = 0; j <=5; j++)
            {
                // Checking if row is equal to column 
                if (i == j)
                    System.out.print( 1+" ");
                else
                    System.out.print( 0+" ");
            } 
            System.out.println();
        }
        
    }
      
    
}

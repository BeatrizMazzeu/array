package lg2;

public class Array4 {
public static void main(String[] args) {
		
		Integer array[][] = new Integer[50][100];
		
		for ( int cont1 = 49; cont1 >= 0; cont1-- )	{
            for ( int cont2 = 99; cont2 >= 0; cont2-- )	{
  			   array[cont1][cont2] = cont1 + cont2; 
	        }   
        }
		
		System.out.println("O valor da soma dos indices e:" );
		
		for ( int cont1 = 49; cont1 >= 0; cont1-- )	{
            for ( int cont2 = 99; cont2 >= 0; cont2-- )	{
            	System.out.println(array[cont1][cont2]);
            }
		}
	}
}

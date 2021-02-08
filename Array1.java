package lg2;

public class Array1 {
public static void main(String[] args) {
		
		Integer array[] = new Integer[9];
		int cont1 = 0;
		
		for ( cont1 = 0; cont1 < array.length; cont1++ )	{
			array[cont1] = cont1;
		}
		
		System.out.println("O conteudo do array e: ");
		
		for ( cont1 = 0; cont1< array.length; cont1++ )	{
			System.out.println( array[cont1] );
		}
		
		for ( cont1 = 0; cont1 < array.length; cont1++ )	{
			array[cont1] = array[cont1] * 3;
		}
		
		System.out.println("O conteudo do array multiplicado por 3 e: ");
		
		for ( cont1 = 0; cont1 < array.length; cont1++ )	{
			System.out.println( array[cont1] );
		}
	}
}

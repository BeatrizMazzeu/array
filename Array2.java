package lg2;

public class Array2 {
	public static void main(String[] args) {

		Integer array[] = new Integer[10];

		for ( int cont1 = 9; cont1 >= 0; cont1-- )	{
			array[cont1] = cont1;
		}
		
		System.out.println("O conteudo do array e: ");
		
		for (int cont1 = 9; cont1 >= 0 ; cont1-- )	{
			System.out.println( array[cont1] );
		}
	}
}

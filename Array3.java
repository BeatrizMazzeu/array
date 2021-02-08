package lg2;

public class Array3 {
public static void main(String[] args) {
		
		Integer array[][] = new Integer[100][100];
		int cont1 = 0;
		int cont2 = 0;
		
		for ( cont1 = 0; cont1 < 100; cont1++ ) {
            for ( cont2 = 0; cont2 < 100; cont2++ ){
  			   array[cont1][cont2] = cont1 - cont2; 
	        }   
        }
		
		System.out.println("A subtração dos indice e:" );
		
		for ( cont1 = 0; cont1 < 100; cont1++ ) {
            for ( cont2 = 0; cont2 < 100; cont2++ ){
            	System.out.println(array[cont1][cont2]);
            }
		}
		
		for ( cont1 = 0; cont1 < 100; cont1++ ) {
            for ( cont2 = 0; cont2 < 100; cont2++ ){
  			   array[cont1][cont2] = 7 * (cont1 - cont2) ; 
            }
		}
		
		System.out.println("A subtração dos indices multiplicadas por 7:" );
		
		for ( cont1 = 0; cont1 < 100; cont1++ ) {
            for ( cont2 = 0; cont2 < 100; cont2++ ){
            	System.out.println(array[cont1][cont2]);
            }
		}
}
}

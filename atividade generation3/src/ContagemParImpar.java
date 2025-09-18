import java.util.Scanner;

public class ContagemParImpar {

	public static void main(String[] args) {
		
		//Scanner
		
		 Scanner leia = new Scanner(System.in);
		 
		 //Declare as variaveis
		 int numero; 
	     int pares = 0, impares = 0;
	     
	     for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o " + i + "º número: ");
	            numero = leia.nextInt();
	            
	            if (numero % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	        }
	     System.out.println("\nTotal de números pares: " + pares);
	        System.out.println("Total de números ímpares: " + impares);
	        
	        
	        
		 

	}

}

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// Scanner
		
	Scanner leia = new Scanner(System.in);
	
	// Declare as variaveis 
	
	float numeroA, numeroB, numeroC, soma;
	
	  System.out.println("Digit o 1º numero ");
	  numeroA = leia.nextFloat();
	  
	  System.out.println("Digit o 2º numero ");
	  numeroB = leia.nextFloat();
	  
	  System.out.println("Digit o 3º numero ");
	  numeroC = leia.nextFloat();
	  
	  soma = (numeroA + numeroB); 
	  
	  if (soma > numeroC) {
		  System.out.println(" A+B é maior que C ");
	  } else if  (soma < numeroC) { 
		  System.out.println(" A+B é menor que C ");
	  } else { 
		  System.out.println(" A+B é igual C ");
	  }
	  
	  leia.close();
		  
		  
	  }
	  

	}



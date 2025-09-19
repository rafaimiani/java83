import java.util.Scanner;

public class Reajuste {

	public static void main(String[] args) {
		
		// Scanner
		
		Scanner leia = new Scanner (System.in);
		
		// Declare as variaveis
		
		String nome;
		String cargo;
		int codigo;
		float porcentual;
		float salario;
		float novoSalario;

	      System.out.println("Nome do colaborador: ");
	      nome = leia.nextLine();
	      
	      
	     System.out.println("Codigo: ");
	      codigo = leia.nextInt();
	      
	      System.out.println("Salario atual: ");
	      salario = leia.nextInt();
	      

	      cargo = "";
	      porcentual = 0.0f;
	      
	      //estrutura switch
	      
	      switch (codigo) {
	      
	      case 1:
	    	  cargo = "Gerente";
              porcentual = 0.10f;  
              break;
              
	      case 2:
	    	  cargo = "Vendedor";
              porcentual = 0.7f;
              break;
	    	  
	      case 3:
	    	  cargo = "Supervisor";
              porcentual = 0.9f;
              break;
              
	      case 4:
	    	  cargo = "Motorista";
              porcentual = 0.6f;
              break;
              
	      case 5:
	    	  cargo = "Estoquista";
              porcentual = 0.5f;
              break;
              
	      case 6:
	    	  cargo = "Tecnico de TI";
              porcentual = 0.8f;
              break;
              
	      default:
              System.out.println("Código inválido!");
              leia.close();
              return;
	      }
		
	      //Calculo do reajuste
	      novoSalario = salario + (salario * porcentual);
	    		  
	    // saida
	    		    
	    	      System.out.println("\nColaborador: " + nome);
	    	      System.out.println("Cargo: " + cargo);
	    	      System.out.printf("Salário antigo: R$ %.2f\n", salario);
	    	        System.out.printf("Novo salário: R$ %.2f\n", novoSalario);

	    	      leia.close();
	    	  }
	    	}
	      
		
		
		
		



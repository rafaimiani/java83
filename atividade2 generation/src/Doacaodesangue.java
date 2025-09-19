import java.util.Scanner;

public class Doacaodesangue {

	public static void main(String[] args) {
		// Sacnner
		
		Scanner leia = new Scanner(System.in);
		
		// Dados
		
		 String nome;
		  System.out.println("Nome do doador: ");
		  nome = leia.nextLine ();
		  
		  
		int idade;
		  System.out.println("Idade: ");
		  idade = leia.nextInt ();
		  
		  // pergunte se é a primeira doação
		  
		  System.out.println("É a primeira doação? (true = sim / false = não)");
          boolean primeiraDoacao = leia.nextBoolean();
		  
		  
          // verifique
          
          if (idade >= 60 && idade < 69 && primeiraDoacao == true) {
				 
				 
       	   System.out.println(nome + " Não esta Apto para doar");
		 } else if(idade >= 18 && idade < 69 ) {
				 System.out.println(nome + " Apto para doar!!");
			 }else{
				 
				 System.out.println(nome + " Não está apto para doar");
	           }
	        	   
	           
		     

			
				   
		    leia.close();
				   
				
			   
			   
		
		 
		
		   
		
		   

	}

}

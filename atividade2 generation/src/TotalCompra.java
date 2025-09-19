import java.util.Scanner;

public class TotalCompra {

	public static void main(String[] args) {
		//Scanner
		
      Scanner leia= new Scanner (System.in);
      
      //Declare as variaveis
      
      int codigo;
      int quantidade;
      String produto;
      double preco;
      double total;
      
      // Entrada dos dados
      
      System.out.println("Código do Produto: ");
      codigo = leia.nextInt();
    
      System.out.println("Quantidade do Produto: ");
      quantidade = leia.nextInt();
      
   
      
      produto = "";
      preco = 0.0;
      
      // estrtura com switch

  
      switch (codigo) {
          case 1:
              produto = "Cachorro Quente";
              preco = 10.00;
              break;
          case 2:
              produto = "X-Salada";
              preco = 15.00;
              break;
          case 3:
              produto = "X-Bacon";
              preco = 18.00;
              break;
          case 4:
              produto = "Bauru";
              preco = 12.00;
              break;
          case 5:
              produto = "Refrigerante";
              preco = 8.00;
              break;
          case 6:
              produto = "Suco de laranja";
              preco = 13.00;
              break;
          default:
              System.out.println("Código inválido!");
              leia.close();
              return;
      }

      // Cálculo do valor total
      total = quantidade * preco;

      // Saída formatada
      System.out.println("\nProduto: " + produto);
      System.out.printf("Valor total: R$ %.2f\n", total);

      leia.close();
  }
}
      
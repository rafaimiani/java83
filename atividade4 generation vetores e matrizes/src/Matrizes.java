import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
	
               //Scanner
		        Scanner leia = new Scanner(System.in);

		        int[][] matriz = new int[3][3];
		        int somaPrincipal = 0;
		        int somaSecundaria = 0;

		      
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
		                matriz[i][j] = leia.nextInt();
		            }
		        }

		        // Elementos principal diagonal
		        System.out.print("\nElementos da Diagonal Principal: ");
		        for (int i = 0; i < 3; i++) {
		            System.out.print(matriz[i][i] + " ");  
		            somaPrincipal += matriz[i][i];
		        }

		        // Elementos da diagonal secundária
		        System.out.print("\n\nElementos da Diagonal Secundária: ");
		        for (int i = 0; i < 3; i++) {
		            System.out.print(matriz[i][2 - i] + " ");
		            somaSecundaria += matriz[i][2 - i];
		        }

		        // Soma das diagonais
		        System.out.println("\n\nSoma dos Elementos da Diagonal Principal: " + somaPrincipal);
		        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);

		        leia.close();
		    }
		}




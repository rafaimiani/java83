import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);

        int[] vetor = new int[10]; 
        int soma = 0;

     
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor[i] = leia.nextInt();
            soma += vetor[i]; 
        }

        // Mostrar elementos ímpares
        System.out.print("\nElementos nos índices ímpares:\n");
        for (int i = 1; i < vetor.length; i += 2) {  //começa em 1 e pula de 2 em 2
            System.out.print(vetor[i] + " ");
        }

        // Mostrar os elementos pares
        System.out.print("\n\nElementos pares:\n");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }

        // Soma/média
        double media = (double) soma / vetor.length;

        System.out.println("\n\nSoma: " + soma);
        System.out.printf("Média: %.2f\n", media);

        leia.close();
    }


	}



import java.util.Scanner;

public class MediaMultiplos3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;
        int soma = 0;      // soma dos múltiplos de 3
        int contador = 0;  // quantidade de múltiplos de 3

        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();

            if (numero % 3 == 0 && numero != 0) { // verifica :é múltiplo de 3 (exceto o 0)
                soma += numero;
                contador++;
            }

        } while (numero != 0);

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("\nA média de todos os números múltiplos de 3 é: " + media);
        } else {
            System.out.println("\nNenhum múltiplo de 3 foi digitado.");
        }

        leia.close();
    }
}


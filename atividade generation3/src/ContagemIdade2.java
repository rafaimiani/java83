import java.util.Scanner;

public class ContagemIdade2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idade;
        int menores21 = 0, maiores50 = 0;

        System.out.print("Digite uma idade: ");
        idade = leia.nextInt();

        // Laço continua enquanto a idade não for negativa
        while (idade >= 0) {
            if (idade < 21) {
                menores21++;
            } 
            if (idade > 50) {
                maiores50++;
            }

            System.out.print("Digite uma idade: ");
            idade = leia.nextInt();
        }

        // Exibe resultados
        System.out.println("\nTotal de pessoas menores de 21 anos: " + menores21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);

        leia.close();
    }
}


package condicionais;
 
import java.util.Scanner;
 
public class Notas {
 
	public static void main(String[] args) {
		float[] nota = new float[4]; // cria array/vetor
		float soma = 0, media = 0;
		int i;
 
		Scanner leia = new Scanner(System.in);
 
		for (i = 0; i < 4; i++) {
			System.out.printf("Insira a nota %d: ", i + 1);
		}
			nota[i] = leia.nextFloat();
			soma += nota[i];
		
 
		media = soma / 4;
 
		if (media >= 7) {
			System.out.println("Aprovado!");
		
		}else if (media < 4) {
			System.out.println("Reprovado!");
		}else {
			System.out.println("Recuperação.");
		}
 
		leia.close();
		
	}
 
}

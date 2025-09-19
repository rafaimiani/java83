import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List {

	public static void main(String[] args) {
		
		
		 Scanner leia = new Scanner(System.in);
	        ArrayList<String> cores = new ArrayList<>();

	        // Leitura 5 cores
	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Digite a " + i + "ª cor: ");
	            String cor = leia.nextLine();
	            cores.add(cor);
	        }

	        //  todas as cores 
	        System.out.println("\nListar todas as cores:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }

	        // Ordenar em ordem crescente
	        Collections.sort(cores);

	        // Mostrar  ordenadas
	        System.out.println("\nOrdenar as cores:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }

	        leia.close();
	    }
	
	

}

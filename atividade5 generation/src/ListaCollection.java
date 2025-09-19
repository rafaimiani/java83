import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ListaCollection {

	public static void main(String[] args) {
		// Scanner leia
		 Scanner leia = new Scanner(System.in);

	   
		  

	        //  números em ordem crescente
	        Set<Integer> numeros = new TreeSet<Integer>();

	        System.out.println("Digite 10 números inteiros:");

	
	        for (int i = 0; i < 10; i++) {
	            int valor = leia.nextInt();
	            numeros.add(valor);
	        }

	        //  Iterator
	        System.out.println("\nListar dados do Set:");
	        Iterator<Integer> it = numeros.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }

	        leia.close();
}
	
}
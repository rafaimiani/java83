package colecoes;

import java.util.Queue;
import java.util.LinkedList;


public class Fila {

	public static void main(String[] args) {
		
		
		  Queue <String> fila = new LinkedList<String>();
		
		fila.add("Maria");
		fila.add("Leticia");
		fila.add("Cintia");
		fila.add("Raissa");
		fila.add("Aline");
		
		System.out.println(fila);
		
		// tirar elemento da fila ---> fila.remove remove o primeiro
		fila.remove();
		
		System.out.println(fila);
		
		//Adiciona novas pessoas ---> adiciona no final 
		fila.add("Milena");
		fila.add("Nadia");
		System.out.println(fila);
		
		//Exibe tamanho da fila
		
		System.out.println("O tamanho da fila é :" + fila.size());
		
		//Exibe o primeiro item da fila
		System.out.println("A primeira pessoa da fila é :" + fila.peek());
		
		
		// percorre a fila
		for(var pessoa: fila) {
			System.out.println(pessoa);
		}
	
		
		
	}

}

package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		
		Deque<String> pilha = new ArrayDeque <String>();
		
		pilha.push("Duna");
		pilha.push("Pai rico , Pai pobre");
		pilha.push("Mals");
		pilha.push("Crime e castigo");
		pilha.push("Quarto de despejo");
		
			System.out.println(pilha);	
			
			
			//remove primeiro item
			pilha.pop();
			System.out.println(pilha);
			
			// verificar um item 
			
			System.out.println("O livro guia dos mochileiros está na pilha ?" + pilha.contains("Guia dos Mochileiros"));
	}

}

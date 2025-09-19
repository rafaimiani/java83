package colecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import java.util.Comparator;

public class ColecaoJava {

    public static void main(String[] args) {

        Set<String> frutas = new HashSet<>();
        

        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Abacate");
        frutas.add("Maçã");
        frutas.add("Banana"); // não será adicionada, pois o Set não permite coisas duplicadas

        for (String fruta : frutas) {
            System.out.println(fruta.hashCode());
            
        }
            
            // pode remover itens
        
        frutas.remove("Abacate");
        System.out.println(frutas);
        
        // saber se existe um item 
        
        System.out.println("A fruta amora está presente no set? " + frutas.contains("Amora"));
        
        // saber se esta vazio
        System.out.println("O set está vazio? " + frutas.isEmpty());
        
        //percorre a coleção do set
        Iterator<String> itFrutas = frutas.iterator();
        
        
        // é a forma de percorrer cada elemento de um Set, List, ou outra coleção, usando o Iterator
        while(itFrutas.hasNext()) {
        	System.out.println(itFrutas.next());
        	
        	
        	// Cria o array list
        ArrayList<String> frutasList = new ArrayList<String>();	
        
        //Adiciona todos os elementos da coleção no array list
        frutasList.addAll(frutas);
        
        // Ordenação de dados em ordem crescente
        frutasList.sort(null);
        
        //Lista de dados do array list
        System.out.println(frutasList);
        
        
        //Ordenação de dados em ordem decrescente 
        frutasList.sort(Comparator.reverseOrder());
        
        System.out.println(frutasList);
        
        
       
       
        
        	
        }
        
        
        
            
           
          
        
    }
}


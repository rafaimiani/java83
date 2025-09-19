package vetores;

public class ExemploVetor {

	public static void main(String[] args) {
		
		
		String nomes [] = {"Cintia", "Stella", "Patricia", "Rafa", "Leticia", "Jamila"};
		
		int numeros[] = new int [5];
		
       System.out.println("Posição 0 = "+ nomes [0]);
       
       for (int indice = 0; indice < nomes.length; indice ++) {
    	   System.out.printf("nomes [%d] = %s%n", indice, nomes [indice]);
       }
	}

}

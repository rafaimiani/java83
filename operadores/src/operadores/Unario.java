package operadores;

public class Unario {

	public static void main(String[] args) {
	
		int preIncrementOriginal = 8, preIncrementResultado;
		int posIncrementOriginal = 8, posIncrementResultado;
		
		System.out.printf("Pós Incremento: valor original = %d%n", preIncrementOriginal);
		preIncrementResultado = ++preIncrementOriginal;
		System.out.printf("Após pré incrementar a variável original: resultado = %d, Valor Atualizado = %d%n", preIncrementResultado, preIncrementOriginal);
 
		System.out.println();
		
		System.out.printf("Pré Incremento: valor original = %d%n", posIncrementOriginal);
		posIncrementResultado = posIncrementOriginal++;
		System.out.printf("Após pós incrementar a variável original: resultado = %d, Valor Atualizado = %d%n", posIncrementResultado, posIncrementOriginal);
	}

}

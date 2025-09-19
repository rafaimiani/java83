package metodos;
 
import java.util.Scanner;
 
public class CalculadoraMetodos {
 
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
	
		double numero1;
		double numero2;
		double resultadoDivisao;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextDouble();	
		
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, somar(numero1, numero2));
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, subtrair(numero1, numero2));
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, multiplicar(numero1, numero2));
		
		resultadoDivisao = dividir(numero1, numero2);
		
		if (resultadoDivisao == -1) {
			System.out.println("Nao existe divisao por zero");
		} else {
			System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, dividir(numero1, numero2));
		}
		
		sobre();
		
		leia.close();
	}
	public static double somar(double numero1, double numero2) {
		return numero1 + numero2;
	}
	public static double subtrair(double numero1, double numero2) {
		return numero1 - numero2;
	}
	public static double multiplicar(double numero1, double numero2) {
		return numero1 * numero2;
	}
	public static double dividir(double numero1, double numero2) {
		if (numero2 == 0) {
			return 0;
		} else {
			return numero1 / numero2;		
		}
	}
	public static void sobre() {
		System.out.println("*********************");
		System.out.println("Calculadora desenvolvida por Rafaela Imiani ");
		System.out.println("*********************");
	}
}
 
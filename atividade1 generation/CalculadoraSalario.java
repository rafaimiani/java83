import java.util.Scanner;

public class CalculadoraSalario {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        // Definir as variáveis
        // salario bruto + adicional noturno + horas extras*5 - descontos = salario liquido

        double salarioBruto = 2000;
        double adicionalNoturno = 500;
        double horasExtras = 100 * 5;
        double descontos = 200;

        double salarioLiquido = salarioBruto + adicionalNoturno + horasExtras - descontos;

        System.out.printf("Salário Líquido: %.2f", salarioLiquido);
        
        leia.close();
    }
}

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaBanco {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Queue<String> fila = new LinkedList<String>();

        int opcao;

        do {
       
            System.out.println("\n-----------------------------------");
            System.out.println("        MENU - FILA BANCO");
            System.out.println("-----------------------------------");
            System.out.println("1 - Adicionar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Chamar Cliente");
            System.out.println("0 - Finalizar Programa");
            System.out.print("Digite uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome: ");
                    String nome = leia.nextLine();
                    fila.add(nome);

                    System.out.println("\nFila:");
                    for (String cliente : fila) {
                        System.out.println(cliente);
                    }
                    System.out.println("\nCliente Adicionado!");
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("\nA Fila está vazia!");
                    } else {
                        System.out.println("\nLista de Clientes na Fila:");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("\nA Fila está vazia!");
                    } else {
                        fila.poll(); 
                        System.out.println("\nFila:");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                        System.out.println("\nO Cliente foi Chamado!");
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Digite novamente.");
                    break;
            }

        } while (opcao != 0);

        leia.close();
    }
}

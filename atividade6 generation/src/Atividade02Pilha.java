import java.util.Scanner;
import java.util.Stack;

public class Atividade02Pilha {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Stack<String> pilha = new Stack<String>();

        int opcao;
        String livro;

        System.out.println("===== MENU PILHA DE LIVROS =====");
        System.out.println("1 - Adicionar um novo livro na pilha");
        System.out.println("2 - Listar todos os livros da pilha");
        System.out.println("3 - Retirar um livro da pilha");
        System.out.println("0 - Finalizar programa");

        do {
            System.out.print("\nDigite uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    livro = leia.nextLine();
                    pilha.push(livro);

                    System.out.println("\nPilha:");
                    for (String l : pilha) {
                        System.out.println(l);
                    }
                    System.out.println("\nLivro adicionado!");
                    break;

                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("\nA pilha está vazia!");
                    } else {
                        System.out.println("\nLista de Livros na Pilha:");
                        for (String l : pilha) {
                            System.out.println(l);
                        }
                    }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("\nA pilha está vazia!");
                    } else {
                        pilha.pop();
                        System.out.println("\nPilha:");
                        for (String l : pilha) {
                            System.out.println(l);
                        }
                        System.out.println("\nUm livro foi retirado da pilha!");
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Digite novamente.");
            }

        } while (opcao != 0);

        leia.close();
    }
}

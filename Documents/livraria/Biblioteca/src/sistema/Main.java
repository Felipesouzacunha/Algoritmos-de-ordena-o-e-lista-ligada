package sistema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Remover livro");
            System.out.println("3. Listar livros");
            System.out.println("4. Ordenar por título");
            System.out.println("5. Ordenar por autor");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o ano de publicação: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine(); 
                    biblioteca.adicionarLivro(titulo, autor, ano);
                    System.out.println("Livro adicionado com sucesso.");
                    break;

                case 2:
                    System.out.print("Digite o título do livro a ser removido: ");
                    String tituloParaRemover = scanner.nextLine();
                    biblioteca.removerLivro(tituloParaRemover);
                    System.out.println("Livro removido, se existia.");
                    break;

                case 3:
                    System.out.println("Lista de livros:");
                    biblioteca.listarLivros();
                    break;

                case 4:
                    biblioteca.ordenarPorTitulo();
                    System.out.println("Livros ordenados por título.");
                    break;

                case 5:
                	biblioteca.ordenarPorAutor();
                	System.out.println("Livros ordenados por autor.");

                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}

package academy.devDojo.maratonaJava.Javacore.Ztreinamento.SistemaDeGestaoDeBibliteca.dominio;

import java.util.*;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        int opcao;
        do {
            menu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrarLivro();
                case 2 -> cadastrarUsuario();
                case 3 -> emprestarLivro();
                case 4 -> devolverLivro();
                case 5 -> listarTudo();
                case 6 -> buscarLivro();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private void menu() {
        System.out.println("""
                \n--- MENU ---
                1. Cadastrar Livro
                2. Cadastrar Usuário
                3. Emprestar Livro
                4. Devolver Livro
                5. Listar Livros/Usuários
                6. Buscar Livro
                0. Sair
                Escolha uma opção:""");
    }

    private void cadastrarLivro() {
        try {
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Autor: ");
            String autor = scanner.nextLine();
            System.out.println("Gênero (FICCAO, TECNICO, BIOGRAFIA, ROMANCE, TERROR, DRAMA, OUTRO): ");
            Genero genero = Genero.valueOf(scanner.nextLine().toUpperCase());
            System.out.print("Ano: ");
            int ano = scanner.nextInt(); scanner.nextLine();
            System.out.print("ISBN: ");
            String isbn = scanner.nextLine();
            livros.add(new Livro(titulo, autor, genero, ano, isbn));
            System.out.println("Livro cadastrado!");
        } catch (Exception e) {
            System.out.println("Erro no cadastro. Verifique os dados.");
        }
    }

    private void cadastrarUsuario() {
        try {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt(); scanner.nextLine();
            usuarios.add(new Usuario(nome, cpf, idade));
            System.out.println("Usuário cadastrado!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar usuário.");
        }
    }

    private void emprestarLivro() {
        System.out.print("CPF do usuário: ");
        String cpf = scanner.nextLine();
        Usuario usuario = encontrarUsuario(cpf);
        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }

        System.out.print("ISBN do livro: ");
        String isbn = scanner.nextLine();
        Livro livro = encontrarLivro(isbn);

        if (livro == null || !livro.isDisponivel()) {
            System.out.println("Livro não encontrado ou indisponível.");
            return;
        }

        if (usuario.emprestarLivro(livro)) {
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Não foi possível emprestar o livro.");
        }
    }

    private void devolverLivro() {
        System.out.print("CPF do usuário: ");
        String cpf = scanner.nextLine();
        Usuario usuario = encontrarUsuario(cpf);
        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }

        System.out.print("ISBN do livro a devolver: ");
        String isbn = scanner.nextLine();
        if (usuario.devolverLivro(isbn)) {
            System.out.println("Livro devolvido.");
        } else {
            System.out.println("Livro não encontrado na lista do usuário.");
        }
    }

    private void listarTudo() {
        System.out.println("\n--- LIVROS ---");
        livros.forEach(System.out::println);

        System.out.println("\n--- USUÁRIOS ---");
        usuarios.forEach(System.out::println);
    }

    private void buscarLivro() {
        System.out.print("Buscar por título ou ISBN: ");
        String termo = scanner.nextLine().toLowerCase();
        livros.stream()
                .filter(l -> l.getTitulo().toLowerCase().contains(termo) || l.getIsbn().equalsIgnoreCase(termo))
                .forEach(System.out::println);
    }

    private Usuario encontrarUsuario(String cpf) {
        return usuarios.stream().filter(u -> u.getCpf().equals(cpf)).findFirst().orElse(null);
    }

    private Livro encontrarLivro(String isbn) {
        return livros.stream().filter(l -> l.getIsbn().equalsIgnoreCase(isbn)).findFirst().orElse(null);
    }
}

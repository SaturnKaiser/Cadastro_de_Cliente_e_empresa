package CDProjektBlackDX;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Sistema de Cadastro de Clientes ===");
            System.out.println("1. Cadastrar Pessoa Física");
            System.out.println("2. Cadastrar Pessoa Jurídica");
            System.out.println("3. Listar Clientes");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            if (opcao == 1) {
                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();
                System.out.print("Digite o endereço: ");
                String endereco = scanner.nextLine();
                System.out.print("Digite o telefone: ");
                String telefone = scanner.nextLine();
                System.out.print("Digite o CPF: ");
                String cpf = scanner.nextLine();

                clientes.add(new PessoaFisica(nome, endereco, telefone, cpf));
                System.out.println("Pessoa Física cadastrada com sucesso!");

            } else if (opcao == 2) {
                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();
                System.out.print("Digite o endereço: ");
                String endereco = scanner.nextLine();
                System.out.print("Digite o telefone: ");
                String telefone = scanner.nextLine();
                System.out.print("Digite o CNPJ: ");
                String cnpj = scanner.nextLine();
                System.out.print("Digite o nome fantasia: ");
                String nomeFantasia = scanner.nextLine();

                clientes.add(new PessoaJuridica(nome, endereco, telefone, cnpj, nomeFantasia));
                System.out.println("Pessoa Jurídica cadastrada com sucesso!");

            } else if (opcao == 3) {
                if (clientes.isEmpty()) {
                    System.out.println("Nenhum cliente cadastrado.");
                } else {
                    for (Cliente cliente : clientes) {
                        cliente.imprimirDados();
                        System.out.println("----------------------------");
                    }
                }

            } else if (opcao == 4) {
                System.out.println("Encerrando o sistema. Até mais!");
                break;

            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}

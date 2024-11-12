import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nSISTEMA DE GERENCIAMENTO");
            System.out.println("1. Cadastrar Gerente");
            System.out.println("2. Cadastrar Programador");
            System.out.println("3. Aumentar Salário dos Funcionários");
            System.out.println("4. Exibir Funcionários");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarFuncionario("Gerente");
                    break;
                case 2:
                    cadastrarFuncionario("Programador");
                    break;
                case 3:
                    aumentarSalario();
                    break;
                case 4:
                    exibirFuncionarios();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);
    }

    private static void cadastrarFuncionario(String tipo) {
        System.out.print("Digite o nome do " + tipo + ": ");
        String nome = scanner.nextLine();
        System.out.print("Digite o salário do " + tipo + ": ");
        BigDecimal salario = scanner.nextBigDecimal();

        Funcionario funcionario;
        if (tipo.equals("Gerente")) {
            funcionario = new Gerente(nome, salario);
        } else {
            funcionario = new Programador(nome, salario);
        }

        funcionarios.add(funcionario);
        System.out.println(tipo + " cadastrado com sucesso!");
    }

    private static void aumentarSalario() {
        if (funcionarios.isEmpty()) {
            System.out.println("Não há funcionários cadastrados para aumentar o salário.");
            return;
        }

        for (Funcionario funcionario : funcionarios) {
            funcionario.aumentaSalario();
        }
        System.out.println("Salários aumentados com sucesso!");
    }

    private static void exibirFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        System.out.println("\nLista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}

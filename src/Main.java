import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarteiraDigital carteira = new CarteiraDigital();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à sua Carteira Digital!");

        while (true) {
            menu();
            int opcao = lerEntradaUsuario(scanner);

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para adicionar ao saldo: ");
                    double valorAdicionar = scanner.nextDouble();
                    carteira.adicionarSaldo(valorAdicionar);
                    break;

                case 2:
                    System.out.print("Digite o valor do pagamento: ");
                    double valorPagamento = scanner.nextDouble();
                    carteira.realizarPagamento(valorPagamento);
                    break;

                case 3:
                    System.out.println("Seu saldo atual é: " + carteira.verificarSaldo());
                    break;

                case 4:
                    System.out.println("Obrigado por usar a sua Carteira Digital!");
                    scanner.close();
                    return;

                case 5:
                    carteira.historicoTransacoes();
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    public static void menu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Adicionar Saldo");
        System.out.println("2 - Realizar Pagamento");
        System.out.println("3 - Verificar Saldo");
        System.out.println("4 - Sair");
        System.out.println("5 - Histórico de Transações");
        System.out.print("Usuário: ");
    }

    public static int lerEntradaUsuario(Scanner scanner) {
        return scanner.nextInt();
    }
}

import java.util.ArrayList;

public class CarteiraDigital {
    public double saldo;
    public ArrayList<String> historico;

    public CarteiraDigital() {
        this.saldo = 0.0;
        this.historico = new ArrayList<>();
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            historico.add("Adicionado: +" + valor);
            System.out.println("Saldo adicionado com sucesso!");
        } else {
            System.out.println("Valor inválido! Digite um valor positivo.");
        }
    }

    public void realizarPagamento(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            historico.add("Pago: -" + valor);
            System.out.println("Pagamento realizado com sucesso!");
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para o pagamento.");
        } else {
            System.out.println("Valor inválido! Digite um valor positivo.");
        }
    }

    public double verificarSaldo() {
        return this.saldo;
    }

    public void historicoTransacoes() {
        System.out.println("Histórico de Transações:");
        if (historico.isEmpty()) {
            System.out.println("Nenhuma transação realizada.");
        } else {
            for (String transacao : historico) {
                System.out.println(transacao);
            }
        }
    }
}

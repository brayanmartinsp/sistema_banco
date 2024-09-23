import java.util.Scanner;

public class ContaTerminal {
    private String nome;
    private String agencia;
    private String conta;
    private double saldo;

    public ContaTerminal(String nome, String agencia, String conta, double saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        String conta = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        ContaTerminal contaTerminal = new ContaTerminal(nome, agencia, conta, saldo);
        contaTerminal.mostrarDados();

        scanner.close();
    }
}

public class Main {

    public static void main(String[] args) {
        Cliente jose = new Cliente();
        jose.setNome("José");


        Conta bb = new ContaCorrente(jose);
        Conta poupanca = new ContaPoupanca(jose);

        bb.depositar(500);
        bb.transferir(100, poupanca);

        bb.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
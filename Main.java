public class Main {

    public static void main(String[] args) {

        Conta CC = new ContaCorrente();
        CC.depositar(100);

        Conta CP = new ContaPoupanca();
        CC.transferir(75,CP);

        CC.imprimirExtrato();
        CP.imprimirExtrato();
    }
    
}

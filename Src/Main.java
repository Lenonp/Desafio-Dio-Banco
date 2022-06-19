public class Main {

    public static void main(String[] args) {
        Cliente Elito = new Cliente();
        Elito.setNome("Élito Lenon Prates");

        Conta CC = new ContaCorrente(Elito);
        CC.depositar(100);

        Conta CP = new ContaPoupanca(Elito);
        CC.transferir(75,CP);

        CC.imprimirExtrato();
        CP.imprimirExtrato();
    }
    
}

public class Conta implements Iconta {

    private int agencia;
    private int numero;
    private double saldo;

    public void sacar() {

    }

    public void depositar() {

    }

    public void transferir() {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @java.lang.Override
    public void sacar(double valor) {

    }

    @java.lang.Override
    public void depositar(double valor) {

    }

    @java.lang.Override
    public void transferir(double valor, Conta contaDestino) {

    }
}

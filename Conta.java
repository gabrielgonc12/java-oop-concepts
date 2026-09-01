public class Conta {
    String titular; 
    int numeroConta;
    String agencia;
    double saldo;

    public Conta(String titular, int numeroConta, String agencia, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (saldo > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }
    
    public void depositar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo += valor;
        }
    }
    
    public double mostrarSaldo() {
        System.out.println("Titular: " + this.titular + "\n Saldo: " + this.saldo);
        return this.saldo;
    }
}
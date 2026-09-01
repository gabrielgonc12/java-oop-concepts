public class AppBanco {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Amanda", 4632759, "polymarket", 33000.0);
        Conta conta2 = new Conta("Batista", 8987467, "satoshi", 9000000.0);
        Conta conta3 = new Conta("Nakamoto", 2387465, "satsails", 4000000.0);

        conta1.depositar(8909487.0);
        conta1.mostrarSaldo();
        
        conta2.sacar(3390898.0);
        conta2.mostrarSaldo();
        
        conta3.sacar(213134.0);
        conta3.mostrarSaldo();   
    }
}

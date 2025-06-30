package banco_digital;

public class BancoDigital {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(1001, "Silmara Marques");
        Conta cp = new ContaPoupanca(1002, "Carlos Silva");

        cc.depositar(1000);
        cc.transferir(200, cp);

        System.out.println("Saldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());
    }
}

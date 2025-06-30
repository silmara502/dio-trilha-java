package banco_digital;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, String titular) {
        super(numero, titular);
    }

    @Override
    public String getTipoConta() {
        return "Conta Poupança";
    }
}

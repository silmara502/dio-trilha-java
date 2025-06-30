package banco_digital;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, String titular) {
		super(numero, titular);
	}

	@Override
	public String getTipoConta() {
        return "Conta Corrente";

	}

}

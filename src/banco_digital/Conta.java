package banco_digital;

public abstract class Conta {
	protected int numero;
	protected String titular;
	protected double saldo;
	
	public Conta (int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0;
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			
		}else {
			System.out.println("Valor inválido para depósito.");
		}
	}
	
	 public void sacar(double valor) {
	        if (valor > 0 && valor <= saldo) {
	            saldo -= valor;
	        } else {
	            System.out.println("Saldo insuficiente ou valor inválido.");
	        }
	    }

	    public void transferir(double valor, Conta destino) {
	        if (valor > 0 && saldo >= valor) {
	            this.sacar(valor);
	            destino.depositar(valor);
	        } else {
	            System.out.println("Transferência inválida.");
	        }
	    }

		public int getNumero() {
			return numero;
		}

	
		public String getTitular() {
			return titular;
		}


		public double getSaldo() {
			return saldo;
		}

	    public abstract String getTipoConta();

	    
}

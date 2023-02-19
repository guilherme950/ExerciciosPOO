package entidades;

public class ContaCorrente {
	private String conta, nomeCliente, agencia;
	private Double saldo;
	
	public ContaCorrente() {
		this.saldo = 0.0;
	}
	
	public ContaCorrente(String conta, String nomeCliente, String agencia) {
		this.conta = conta;
		this.nomeCliente = nomeCliente;
		this.agencia = agencia;
		this.saldo = 0.0;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Double getSaldo() {
		return this.saldo;
	}
	
	public void imprimir() {
		System.out.println("------------------------------");
		System.out.println("Conta: " + getConta());
		System.out.println("Agência: " + getAgencia());
		System.out.println("Dono: " + getNomeCliente());
		System.out.println("Saldo: "+ getSaldo()+ "\n");
	}
	
	public int sacar(Double valor) {
		if(getSaldo() >= valor) {
			this.saldo -= valor;
			return 1;
		}else {
			return 0;
		}
	}
	
	public void depositar(Double valor) {
		this.saldo += valor;
	}
	
}

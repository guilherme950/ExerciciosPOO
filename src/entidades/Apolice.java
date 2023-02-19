package entidades;

public class Apolice {
	private String nomeSegurado;
	private int idade;
	private double valorPremio;
	
	public void imprimir() {
		System.out.println("----------- APOLICE -------------");
		System.out.println("Nome do Segurado: " + getNomeSegurado());
		System.out.println("Idade: " + getIdade());
		System.out.println("Valor do Prêmio: " + getValorPremio());
		System.out.println("---------------------------------\n");
	}
	
	public void calcularPremioApolice() {
		if(getIdade() >= 18 && getIdade() <= 25) {
			setValorPremio(getValorPremio() + (getValorPremio()*20) / 100);
		}else if(getIdade() > 25 && getIdade() <= 36) {
			setValorPremio(getValorPremio() + (getValorPremio()*15) / 100);
		}else if(getIdade() > 36) {
			setValorPremio(getValorPremio() + (getValorPremio()*10) / 100);
		}
	}
	
	public void oferecerDesconto(String cidade) {
		switch(cidade) {
			case "Curitiba":
				setValorPremio(getValorPremio() - getValorPremio() * 0.2);
				break;
			case "Rio de Janeiro":
				setValorPremio(getValorPremio() - getValorPremio() * 0.15);
				break;
			case "Sao Paulo":
				setValorPremio(getValorPremio() - getValorPremio() * 0.1);
				break;
			case "Belo Horizonte":
				setValorPremio(getValorPremio() - getValorPremio() * 0.05);
		}
	}

	public String getNomeSegurado() {
		return nomeSegurado;
	}

	public void setNomeSegurado(String nomeSegurado) {
		this.nomeSegurado = nomeSegurado;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getValorPremio() {
		return valorPremio;
	}

	public void setValorPremio(double valorPremio) {
		this.valorPremio = valorPremio;
	}
	
	
}

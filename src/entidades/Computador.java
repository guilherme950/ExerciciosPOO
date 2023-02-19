package entidades;

public class Computador {
	private String marca;
	private String cor;
	private String modelo;
	private int numeroSerie;
	private double preco;
	
	public void imprimir() {
		System.out.println("------------ DADOS DO COMPUTADOR ------------");
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Cor: " + getCor());
		System.out.println("Número de serie: " + getNumeroSerie());
		System.out.printf("Preço: R$ %.2f\n", getPreco());
		System.out.println("---------------------------------------------\n");
	}
	
	public void calcularValor() {
		if(this.getMarca().equals("HP")) {
			this.setPreco(getPreco() + (getPreco() * 0.3));
		}else if(this.getMarca().equals("IBM")){
			this.setPreco(getPreco() + (getPreco() * 0.5));
		}else {
			this.setPreco(getPreco());
		}
	}
	
	public int alterarValor(double preco) {
		if(preco > 0) {
			this.setPreco(preco);
			this.calcularValor();
			return 1;
		}else {
			return 0;
		}
	}

	public Computador(String marca, String cor, String modelo, int numeroSerie, double preco) {
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public String getCor() {
		return cor;
	}

	public String getModelo() {
		return modelo;
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}

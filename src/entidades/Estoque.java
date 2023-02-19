package entidades;

public class Estoque {
	String nomeProduto;
	Double valor;
	Integer quantidade;
	
	public Estoque(String nomeProduto, Double valor, Integer quantidade) {
		super();
		this.nomeProduto = nomeProduto;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public Double getValor() {
		return valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public void imprimir() {
		System.out.println("Produto: " + getNomeProduto());
		System.out.println("Valor: " + getValor());
		System.out.println("Quantidade: "+ getQuantidade());
		System.out.println();
	}
	
	public int verificarDisponibilidade(int quantidade) {
		if(quantidade > 0 && quantidade <= getQuantidade()){
			return 1;
		}else {
			System.out.println("Quantidade Indisponível");
			return 0;
		}
	}
	
	public int removerProdutos(int quantidade) {
		if(verificarDisponibilidade(quantidade) == 1) {
			setQuantidade(getQuantidade() - quantidade);
			return 1;
		}else {
			System.out.println("ERRO: Não foi possível remover a quantidade solicitada!!\n");
			return 0;
		}
	}
	
}

package entidades;

public class Eleitoral {
	String nome;
	int idade;
	
	public Eleitoral(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void imprimir() {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		verificar();
	}

	private void verificar() {
		if(getIdade() < 16) {
			System.out.println("Eleitor não pode votar\n");
		}else if(getIdade() <= 65) {
			System.out.println("Eleitor deve votar\n");
		}else {
			System.out.println("Voto facultativo");
		}
	}
}

package entidades;

public class Acampamento {
	private String nome;
	private char equipe;
	private int idade;
	
	public void imprimir() {
		System.out.println("---------- ACAMPAMENTO ----------");
		System.out.println("Nome: " + getNome());
		System.out.println("Equipe: " + getEquipe());
		System.out.println("Idade: " + getIdade());
		System.out.println("---------------------------------\n");
	}
	public void separarGrupo() {
		if(getIdade() >= 6 && getIdade() <= 10) {
			setEquipe('A');
		}else if(getIdade() >= 11 && getIdade() <= 20) {
			setEquipe('B');
		}else if(getIdade() > 21) {
			setEquipe('C');
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getEquipe() {
		return equipe;
	}
	public void setEquipe(char equipe) {
		this.equipe = equipe;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}

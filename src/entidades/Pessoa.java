package entidades;

import java.time.LocalDate;

public class Pessoa {
	
	private int cpf;
	private String nome;
	private LocalDate dataNasc;
	
	public Pessoa() {
	}
	
	public Pessoa(int cpf, String nome,LocalDate dataNasc) {
		this.cpf = cpf;
		this.nome = nome;
		this.dataNasc = dataNasc;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public String toString() {
		return "Nome: " + getNome() + 
				"\nCPF: " + getCpf() + 
				"\nData de Nascimento: " + getDataNasc();
	}
	
}

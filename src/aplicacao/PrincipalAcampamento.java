package aplicacao;

import entidades.Acampamento;

public class PrincipalAcampamento {
	public static void main(String[] args) {
		Acampamento ac = new Acampamento();
		
		ac.setNome("Guilherme M");
		ac.setIdade(32);
		ac.imprimir();
		ac.separarGrupo();
		ac.imprimir();
	}
}

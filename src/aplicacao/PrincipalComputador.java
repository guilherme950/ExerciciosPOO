package aplicacao;

import entidades.Computador;

public class PrincipalComputador {

	public static void main(String[] args) {
		Computador pc, pc2;
		
		pc = new Computador("HP", "Preto", "notebook", 4568, 2500.00);
		//pc.imprimir();
		pc.calcularValor();
		pc.imprimir();
		
		pc2 = new Computador("IBM", "Cinza", "PC de tubo", 666, 1400.00);
		pc2.calcularValor();
		pc2.imprimir();
		int aux = pc2.alterarValor(1000);
		
		if(aux == 0) {
			System.out.println("Valor NÃO alterado");
		}else {
			System.out.println("Valor alterado");
		}
		pc2.imprimir();
	}

}

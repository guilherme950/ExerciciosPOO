package aplicacao;

import java.util.Scanner;

import entidades.Apolice;

public class PrincipalApolice {
	
	public static void main(String[] args) {
		Apolice ap = new Apolice();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		ap.setNomeSegurado(sc.nextLine());
		System.out.print("Digite a idade: ");
		ap.setIdade(sc.nextInt());
		System.out.print("Digite o valor do prêmio: ");
		ap.setValorPremio(sc.nextDouble());
		System.out.println();
		
		ap.imprimir();
		ap.calcularPremioApolice();
		ap.imprimir();
		ap.oferecerDesconto("Curitiba");
		ap.imprimir();
		
		sc.close();
	}

}

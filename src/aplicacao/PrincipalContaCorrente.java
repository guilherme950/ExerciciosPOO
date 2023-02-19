package aplicacao;

import java.util.Scanner;

import entidades.ContaCorrente;

public class PrincipalContaCorrente {
	static Scanner sc = new Scanner(System.in);
	static ContaCorrente CC = new ContaCorrente();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("----- CONTA CORRENTE -----");
			System.out.print("1 - Cadastrar\n2 - Sacar\n3 - Depositar\n4 - Consultar\n5 - Sair\n\nInforme aqui: ");
			opcao = sc.nextInt();
		
			switch(opcao) {
				case 1:
					execCadastro();
					break;
				case 2:
					execSaque();
					break;
				case 3:
					execDeposito();
					break;
				case 4:
					execConsulta();
					break;
				case 5:
					System.out.println("Saindo...");
					System.exit(1);
					break;
				default:
					System.out.println("Insira um valor válido!!\n");
					break;
			}
		}while(opcao != 5);
		
		sc.close();
	}

	private static void execCadastro() {
		System.out.println("---- CADASTRO CLIENTE ----");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Conta: ");
		String conta = sc.nextLine();
		System.out.print("Agencia: ");
		String agencia = sc.nextLine();
		
		CC = new ContaCorrente(conta, nome, agencia);
		main(null);
	}

	private static void execConsulta() {
		CC.imprimir();
		main(null);
	}

	private static void execSaque() {
		double valor;
		
		System.out.print("Digite o valor a ser sacado: ");
		valor = sc.nextDouble();
		
		if(CC.sacar(valor) == 1) {
			System.out.println("Saque realizado!");
		}else {
			System.out.println("Saque NÃO realizado!!");
		}
		main(null);
		
	}

	private static void execDeposito() {
		System.out.print("Digite o valor do depósito: ");
		Double valor = sc.nextDouble();
		
		CC.depositar(valor);

		main(null);
	}
	

}

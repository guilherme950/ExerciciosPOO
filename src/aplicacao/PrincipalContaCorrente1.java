package aplicacao;

import java.util.Scanner;

import entidades.ContaCorrente;

public class PrincipalContaCorrente1 {
	static Scanner sc = new Scanner(System.in);
	static final int TAM = 3;
	static ContaCorrente cc[] = new ContaCorrente[TAM];
	public static int indice = 0;
	
	public static void main(String[] args) {
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
	}

	private static void execConsulta() {
		System.out.print("Informe o id da conta: ");
		int id = sc.nextInt();
		if(id >= 0 && id < 3) {
			if(verificaConta(id))
				cc[id].imprimir();
			else
				System.out.println("Nenhuma conta cadastrada nesse id!\n");
		}else
			System.out.println("Conta inexistente!\n");
	}

	private static void execDeposito() {
		System.out.print("Informe o id da conta: ");
		int id = sc.nextInt();
		if(id >= 0 && id < 3) {
			if(verificaConta(id)) {
				System.out.print("Informe um valor para depósito: ");
				double dep = sc.nextDouble();
				cc[id].depositar(dep);
			}
			else
				System.out.println("Nenhuma conta cadastrada nesse id!\n");
		}else
			System.out.println("Conta inexistente!\n");
	}

	private static void execSaque() {
		System.out.print("Informe o id da conta: ");
		int id = sc.nextInt();
		if(id >= 0 && id < 3) {
			if(verificaConta(id)) {
				System.out.print("Informe um valor para saque: ");
				double sac = sc.nextDouble();
				if(cc[id].sacar(sac) == 1) {
				    System.out.println("Saque realizado com sucesso!\n");
				}else
					System.out.println("Saque nao realizado!!\n");
			}else
				System.out.println("Nenhuma conta cadastrada nesse id!\n");
		}else
			System.out.println("Conta inexistente!\n");
	}

	private static void execCadastro() {
		sc.nextLine();
		System.out.println("---- CADASTRO CLIENTE ----");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Conta: ");
		int conta = sc.nextInt();
		sc.nextLine();
		System.out.print("Agencia: ");
		String agencia = sc.nextLine();
		cc[indice] = new ContaCorrente(conta, nome, agencia);
		indice++;
		if(indice > 2) {
			System.out.println("Limites de Contas alcançadas!!\n");
			indice = 0;
		}	
	}
	
	private static boolean verificaConta(int id) {
		if(cc[id] != null) {
			return true;
		}else
			return false;
	}
}

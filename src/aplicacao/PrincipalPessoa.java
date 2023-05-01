package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import entidades.Pessoa;

public class PrincipalPessoa {
	
	static Pessoa p1;
	static LocalDate  d;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("1 - Cadastrar\n2 - Imprimir\n0 - Sair\n\nInforme aqui: ");
		int op = sc.nextInt();
		
		switch (op) {
		case 0: 
			System.exit(0);
			break;
		case 1: 
			cadastrar();
			main(null);
			break;
		case 2: 
			System.out.println(p1 + "\n");
			main(args);
			break;
		default:
			System.out.println("Opção Inválida!!\n");
			main(args);
		}
	}

	public static void cadastrar() {
		String dataNasc;
		System.out.println("Informe seu CPF: ");
		int cpf = sc.nextInt();
		sc.nextLine();
		System.out.println("Informe seu nome: ");
		String nome = sc.nextLine();
		do {
			System.out.println("Informe sua data de Aniversário (aaaa/mm/dd): ");
			dataNasc = sc.nextLine();
			
			if(dataValida(dataNasc) == false) {
				System.out.println("Formato inválido!!\n");
			}
		}while(dataValida(dataNasc) == false);
		p1 = new Pessoa(cpf, nome, d);
	}
	
	private static boolean dataValida(String data) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	        d = LocalDate.parse(data, formatter);    
	        return true;
		}
		catch(DateTimeParseException e) {
			return false;
		}
	}
}

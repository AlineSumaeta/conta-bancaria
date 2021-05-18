package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.print("Informe o numero da conta: ");
		int account = sc.nextInt();
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Deseja depositar? [s/n]");
		
		char resposta = sc.next().charAt(0);
		if(resposta == 's') {
			System.out.print("Deposito inicial: ");
			int primeiroDeposito = sc.nextInt();
			conta = new Conta (account, nome, primeiroDeposito);
		}
		else {
			conta = new Conta(account, nome);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Valor para ser depositado: ");
		double depositar = sc.nextDouble();
		conta.depositar(depositar);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(conta);

		System.out.println();
		System.out.print("Valor para ser sacado: ");
		double sacar = sc.nextDouble();
		conta.sacar(sacar);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(conta);

		
		
		
		
		
		sc.close();

	}

}

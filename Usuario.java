package model;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Usuario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Conta conta;
		
		System.out.print("Conta:  ");
		int numero = sc.nextInt();
		System.out.print("Nome:  ");
		String nome = sc.next();
		System.out.print("Gostaria de fazer um deposito inicial? [s/n]  ");
		char resposta = sc.next().charAt(0);
		
		if ( resposta  == 's') {
			System.out.print("Valor de deposito: R$");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
		} else {
			conta = new Conta(numero, nome);
		}

		System.out.println();
		System.out.println("Informações sobre a conta");
		System.out.println(conta);

		
		System.out.println();
		System.out.print(" Valor de deposito:  ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		
		System.out.println();
		System.out.println("Informação sobre a conta");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Valor do saque:  ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		
		System.out.println();
		System.out.println("Informçãoes sobre a conta");
		System.out.println(conta);
		
		
		
		
	}

}

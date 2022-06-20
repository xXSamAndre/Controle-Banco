package entities;

public class Conta {
    //conta, nome, saldo = variaveis
	//saque, deposito
	
	private int numero;
	private String nome;
	private double saldo;
	
	//get = pegar
	//set = fazer
	
	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	//this = objeto local 
	
	public Conta(int numero , String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public Conta(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial);
	}
	
	
	
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo = valor + 5;
	}
	
	public String toString() {
		return "Conta:  "+ numero + " Nome:   " + " Saldo: R$  "+ String.format("%.2f", saldo);
	}
	
	
}

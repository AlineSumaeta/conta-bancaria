package entities;

public class Conta {
	
	private int account;
	private String nome;
	private double deposito;
	
	public Conta (int account, String nome, double primeiroDeposito) {
		this.account = account;
		this.nome = nome;
		deposito = primeiroDeposito;
	}
	public Conta (int account, String nome) {
		this.account = account;
		this.nome = nome;
	}	
	public int getAccount() {
		return account;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDeposito() {
		return deposito;
	}
	
	public void depositar(double valor) {
		deposito += valor;
	}
	
	public void sacar(double valor) {
		deposito -= valor + 5;
	}
	
	public String toString() {
		return "Conta: "
		+ account
		+", Nome do titular: "
		+nome
		+", Saldo: $"
		+String.format("%.2f", deposito);
	}
	
	
	
	
	
	

}

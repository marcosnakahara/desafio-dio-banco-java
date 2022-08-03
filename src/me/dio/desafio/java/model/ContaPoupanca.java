package me.dio.desafio.java.model;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Banco banco, Cliente cliente) {
		super(banco, cliente);
	}
	
	public ContaPoupanca(Banco banco, Cliente cliente, int agencia, int numero) {
		super(banco, cliente, agencia, numero);
	}

	public ContaPoupanca(Banco banco, Cliente cliente, int agencia, int numero, double saldo) {
		super(banco, cliente, agencia, numero, saldo);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("#### EXTRATO - CONTA POUPANÇA ####");		
		imprimirInfos();		
	}
}

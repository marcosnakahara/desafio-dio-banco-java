package me.dio.desafio.java.model;

public class ContaCorrente extends Conta {

	public ContaCorrente(Banco banco, Cliente cliente) {
		super(banco, cliente);
	}
	
	public ContaCorrente(Banco banco, Cliente cliente, int agencia, int numero) {
		super(banco, cliente, agencia, numero);
	}

	public ContaCorrente(Banco banco, Cliente cliente, int agencia, int numero, double saldo) {
		super(banco, cliente, agencia, numero, saldo);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("#### EXTRATO - CONTA CORRENTE ####");		
		imprimirInfos();
	}	
}

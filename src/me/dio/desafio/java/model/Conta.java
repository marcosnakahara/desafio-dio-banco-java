package me.dio.desafio.java.model;

import lombok.Data;

@Data
public abstract class Conta implements IConta{

	private static final int AGENCIA_PADRAO = 20; 
	private static int sequencial = 1;

	private final Banco banco;
	private final Cliente cliente;
	private final int agencia;
	private final int numero;
	private double saldo;
	
	public Conta(Banco banco, Cliente cliente) {
		this.banco = banco;
		this.cliente = cliente;
		this.agencia = AGENCIA_PADRAO;
		this.numero = sequencial++;
	}
	
	public Conta(Banco banco, Cliente cliente, int agencia, int numero) {
		super();
		this.banco = banco;
		this.cliente = cliente;		
		this.agencia = agencia;
		this.numero = numero;
	}

	public Conta(Banco banco, Cliente cliente, int agencia, int numero, double saldo) {
		super();
		this.banco = banco;
		this.cliente = cliente;		
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;		
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;		
	}
	
	@Override
	public void transferir(Conta contaDestino, double valor) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}	
		
	protected void imprimirInfos() {
		System.out.println(String.format("Banco: %s", this.banco));
		System.out.println(String.format("Titular: %s", this.cliente));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: R$%.2f", this.saldo));		
	}
}

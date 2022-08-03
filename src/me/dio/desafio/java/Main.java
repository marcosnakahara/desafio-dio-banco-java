package me.dio.desafio.java;

import me.dio.desafio.java.model.Banco;
import me.dio.desafio.java.model.Cliente;
import me.dio.desafio.java.model.Conta;
import me.dio.desafio.java.model.ContaCorrente;
import me.dio.desafio.java.model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco(999, "Banco DIO");
		Cliente cliente = new Cliente("Joselito Javeiro", "123.456.789-00" );
		
		Conta cc = new ContaCorrente(banco, cliente);
		Conta cp = new ContaPoupanca(banco, cliente);
		
		cc.depositar(100.0);
		cc.transferir(cp, 100.0);
		
		cc.imprimirExtrato();
		System.out.println("");
		cp.imprimirExtrato();						
	}
}

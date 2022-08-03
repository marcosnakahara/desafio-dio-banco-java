package me.dio.desafio.java.model;

import lombok.Data;

@Data
public class Banco {

	private final String nome;
	private final int codigo;

	public Banco(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome + " (" + codigo + ")";
	}
}

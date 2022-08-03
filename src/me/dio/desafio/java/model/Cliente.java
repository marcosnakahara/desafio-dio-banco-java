package me.dio.desafio.java.model;

import lombok.Data;

@Data
public class Cliente {
	
	private final String nome;
	private final String documento;

	public Cliente(String nome, String documento) {
		this.nome = nome;
		this.documento = documento;
	}
	
	@Override
	public String toString() {
		return nome + " (" + documento + ")";
	}
}

package com.labs.lab1.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString
public class Cliente {

	private final String nome;
	private final String email;
	private final String telefone;
	private Boolean ativo = false;

	public void ativar() {
		this.ativo = true;
	}

}

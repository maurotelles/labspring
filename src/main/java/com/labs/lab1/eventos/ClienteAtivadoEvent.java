package com.labs.lab1.eventos;

import com.labs.lab1.model.Cliente;

import lombok.Getter;

@Getter
public class ClienteAtivadoEvent {

	private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {
		this.cliente = cliente;
	}

}

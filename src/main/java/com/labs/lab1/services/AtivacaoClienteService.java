package com.labs.lab1.services;

import java.util.List;

import com.labs.lab1.model.Cliente;
import com.labs.lab1.notificadores.Notificador;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AtivacaoClienteService {

	private List<Notificador> notificadores;

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificadores.forEach(notificador -> {

			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		});
	}

}

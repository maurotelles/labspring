package com.labs.lab1.services;

import java.util.List;

import com.labs.lab1.model.Cliente;
import com.labs.lab1.notificadores.Notificador;

public class AtivacaoClienteServiceCicloVida {

	private List<Notificador> notificadores;

	public AtivacaoClienteServiceCicloVida(List<Notificador> notificadores) {
		this.notificadores = notificadores;
	}

	public void init() {
		System.out.println("init" + notificadores);
	}

	public void destroy() {
		System.out.println("destroy" + notificadores);
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificadores.forEach(notificador -> {

			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		});
	}

}

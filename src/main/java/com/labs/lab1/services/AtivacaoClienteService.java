package com.labs.lab1.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.labs.lab1.model.Cliente;
import com.labs.lab1.notificadores.Notificador;

@Component
public class AtivacaoClienteService {

	private List<Notificador> notificadores;

	public AtivacaoClienteService(List<Notificador> notificadores) {
		this.notificadores = notificadores;
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificadores.forEach(notificador -> {

			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		});
	}

}

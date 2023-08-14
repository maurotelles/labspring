package com.labs.lab1.eventos.listeners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.labs.lab1.eventos.ClienteAtivadoEvent;

@Component
public class NotificacaoService {

	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		System.out.println(event.getCliente().getNome() + " agora está ativo.");

	}
}

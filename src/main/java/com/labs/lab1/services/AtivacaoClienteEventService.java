package com.labs.lab1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.labs.lab1.eventos.ClienteAtivadoEvent;
import com.labs.lab1.model.Cliente;

@Component
@Qualifier("ativar")
public class AtivacaoClienteEventService {

	@Autowired
	private ApplicationEventPublisher eventPublisher;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));

	}

}

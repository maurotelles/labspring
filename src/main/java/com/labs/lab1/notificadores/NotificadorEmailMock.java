package com.labs.lab1.notificadores;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.labs.lab1.model.Cliente;

import lombok.Setter;

@Profile("dev")
@Setter
@Component
@Qualifier("email")
public class NotificadorEmailMock implements Notificador {

	private boolean caixaAlta;
	private String hostServidorSmtp;

	public NotificadorEmailMock() {
		System.out.println("Notificador email MOCK");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if (caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("MOCK: Notificando %s através do e-mail %s, usando SMTP %s: %s\n", cliente.getNome(),
				cliente.getEmail(), this.hostServidorSmtp, mensagem);
	}
}

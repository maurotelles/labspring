package com.labs.lab1.notificadores;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;

import com.labs.lab1.model.Cliente;

import lombok.Setter;

@Setter
@Profile("prod")
@Qualifier("email")
public class NotificadorEmail implements Notificador {

	private boolean caixaAlta;
	@Value("${smtp}")
	private String hostServidorSmtp;

	public NotificadorEmail(String hostServidorSmtp) {
		System.out.println("Notificador email");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if (caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("Notificando %s através do e-mail %s, usando SMTP %s: %s\n", cliente.getNome(),
				cliente.getEmail(), this.hostServidorSmtp, mensagem);
	}
}

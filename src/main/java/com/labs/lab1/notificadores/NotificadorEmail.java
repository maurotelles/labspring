package com.labs.lab1.notificadores;

import org.springframework.context.annotation.Profile;

import com.labs.lab1.model.Cliente;

import lombok.Setter;

@Setter
@Profile("prod")
public class NotificadorEmail implements Notificador {

	private boolean caixaAlta;
	private String hostServidorSmtp;

	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
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

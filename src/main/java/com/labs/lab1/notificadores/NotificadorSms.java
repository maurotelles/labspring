package com.labs.lab1.notificadores;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.labs.lab1.model.Cliente;

@Component
@Qualifier("sms")
public class NotificadorSms implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do SMS %s, %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);

	}

}

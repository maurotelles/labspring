package com.labs.lab1.configurations;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.labs.lab1.notificadores.Notificador;
import com.labs.lab1.notificadores.NotificadorEmail;
import com.labs.lab1.services.AtivacaoClienteService;

@Configuration
@Profile("prod")
public class ConfigurationsLab {

	@Bean
	@Qualifier("email")
	NotificadorEmail notificadoEmail() {
		NotificadorEmail notificadorEmail = new NotificadorEmail("labs.com.br");
		notificadorEmail.setCaixaAlta(false);
		return notificadorEmail;
	}

	@Bean
	AtivacaoClienteService ativacaoCliente(List<Notificador> notificadores) {
		AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificadores);
		return ativacaoClienteService;
	}

}

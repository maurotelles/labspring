package com.labs.lab1.configurations;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.labs.lab1.notificadores.Notificador;
import com.labs.lab1.services.AtivacaoClienteServiceCicloVida;

@Configuration
public class ConfigurationDestroy {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	AtivacaoClienteServiceCicloVida getAtivacaoCicloVida(List<Notificador> notificadores) {
		return new AtivacaoClienteServiceCicloVida(notificadores);
	}
}

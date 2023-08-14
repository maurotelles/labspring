package com.labs.lab1.web;

import org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.labs.lab1.model.Cliente;
import com.labs.lab1.services.AtivacaoClienteEventService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class SendNotificationEvent {

	private ApplicationContext applicationContext;

	@GetMapping("/notificarevento/{tipo}")
	@ResponseBody
	public String send(@PathVariable("tipo") String tipo) {
		System.out.println(tipo);
		AtivacaoClienteEventService eventService = BeanFactoryAnnotationUtils.qualifiedBeanOfType(
				applicationContext.getAutowireCapableBeanFactory(), AtivacaoClienteEventService.class, tipo);

		Cliente joao = new Cliente("João", "joao@mail.com", "(11) 6547-5698");
		Cliente maria = new Cliente("Maria", "maria@email.com", "(12) 9877-5454");
		eventService.ativar(maria);

		return "enviado";

	}
}

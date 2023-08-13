package com.labs.lab1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.labs.lab1.model.Cliente;
import com.labs.lab1.services.AtivacaoClienteService;

@Controller
public class Index {

	AtivacaoClienteService ativacaoCliente;

	public Index(AtivacaoClienteService ativacaoCliente) {
		this.ativacaoCliente = ativacaoCliente;
	}

	@GetMapping
	@ResponseBody
	public String start() {

		Cliente joao = new Cliente("João", "joao@mail.com", "(11) 6547-5698");
		Cliente maria = new Cliente("Maria", "maria@email.com", "(12) 9877-5454");

		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);

		return "started";
	}
}

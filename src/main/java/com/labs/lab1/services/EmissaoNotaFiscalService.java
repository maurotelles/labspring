package com.labs.lab1.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.labs.lab1.model.Cliente;
import com.labs.lab1.model.Produto;
import com.labs.lab1.notificadores.Notificador;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class EmissaoNotaFiscalService {

	private List<Notificador> notificadores;

	public void emitir(Cliente cliente, Produto produto) {
		notificadores.forEach(notificador -> {
			notificador.notificar(cliente, "Nota Fiscal do produto" + produto.getNome() + " foi emitida.");
		});
	}

}

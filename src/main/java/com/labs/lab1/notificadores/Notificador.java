package com.labs.lab1.notificadores;

import com.labs.lab1.model.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);
}

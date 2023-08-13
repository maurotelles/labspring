package com.labs.lab1.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class Produto {

	private final String nome;
	private final BigDecimal valorTotal;

}

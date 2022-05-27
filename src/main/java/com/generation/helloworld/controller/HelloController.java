package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello Turma 53";
	}

	@GetMapping("/bsm")
	public String bsm() {
		return "Mentalidade de Crescimento,\r\n"
				+ "Persistência,\r\n"
				+ "Responsabilidade Pessoal,\r\n"
				+ "Orientação ao Futuro,\r\n"
				+ "Comunicação,\r\n"
				+ "Orientação ao Detalhe,\r\n"
				+ "Proatividade,\r\n"
				+ "Trabalho em Equipe.";
	}
	
	@GetMapping ("/obj")
	public String obj() {
		return "Absorver o máximo de conhecimento possível durante a semana, finalizar meu curso de "
				+ "Power BI e iniciar um curso de Figma.";
	}
}

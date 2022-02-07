package com.gama.contratealguem.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/teste"})
public class Teste {
	
	@GetMapping
	public void oi() {
		System.out.println("teste conexão");
	}

}

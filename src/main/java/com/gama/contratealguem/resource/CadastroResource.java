package com.gama.contratealguem.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gama.contratealguem.domain.Usuario;

@RestController
@RequestMapping("/cadastro")
public class CadastroResource {

	
	@GetMapping()
	public List<Usuario>getUsuarios(@RequestParam("cpf") String cpf){
		List<Usuario> usuarios = getUsuarios(cpf);
		return usuarios;
	}
	
}

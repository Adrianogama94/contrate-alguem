package com.gama.contratealguem.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gama.contratealguem.domain.Usuario;
import com.gama.contratealguem.service.CadastroService;

@RestController
@RequestMapping("/cadastro")
public class CadastroResource {

	@Autowired
	private CadastroService cadastroService;
	
	@GetMapping()
	public List<Usuario>getUsuarios(@RequestParam("cpf") String cpf){
		List<Usuario> usuarios = this.cadastroService.getUsuarios(cpf);
		return usuarios;
	}

	@GetMapping()
	public List<Usuario>getUsuariosCnpj(@RequestParam("cnpj") String cnpj){
		List<Usuario> usuarios = this.cadastroService.getUsuariosCnpj(cnpj);
		return usuarios;
	}

	
}

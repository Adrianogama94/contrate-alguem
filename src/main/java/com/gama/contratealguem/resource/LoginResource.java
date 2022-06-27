package com.gama.contratealguem.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gama.contratealguem.domain.Usuario;
import com.gama.contratealguem.service.LoginService;

@RestController("api/login")
public class LoginResource {
	
	@Autowired
	public LoginService loginService;
	
	@GetMapping
	public ResponseEntity<Usuario> getLogin(@RequestParam("login") String login) {
		return ResponseEntity.ok().body(null);
	}
	
}

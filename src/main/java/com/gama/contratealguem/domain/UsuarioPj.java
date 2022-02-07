package com.gama.contratealguem.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario_pj", schema = "contrate")
public class UsuarioPj {
	
	@Id
	private Long cnpj;

	private String email;
	
	private String user;
	
	private String nome;
	
	private Long telefone;
	
	public UsuarioPj() {
		
	}

	public UsuarioPj(Long cnpj, String email, String user, String nome, Long telefone) {
		this.cnpj = cnpj;
		this.email = email;
		this.user = user;
		this.nome = nome;
		this.telefone = telefone;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioPj other = (UsuarioPj) obj;
		return Objects.equals(cnpj, other.cnpj);
	}
	

}

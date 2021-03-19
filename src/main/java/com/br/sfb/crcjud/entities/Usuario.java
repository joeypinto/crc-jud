package com.br.sfb.crcjud.entities;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
@Document(collection = "usuario")
public class Usuario implements UserDetails{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String nome;
    private String username;
    private String password;
	//private String cpf;
	private Boolean ativo;
	private List<Grupo> grupos;
	//private LocalDate dataNascimento;
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		
		List<Grupo> permissoes = grupos;
		permissoes.forEach(p -> authorities.add(new SimpleGrantedAuthority(p.getNome().toUpperCase())));		
		return authorities;

	}
	 @Override
	    public boolean isAccountNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isAccountNonLocked() {
	        return true;
	    }

	    @Override
	    public boolean isCredentialsNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isEnabled() {
	        return true;
	    }
	


}

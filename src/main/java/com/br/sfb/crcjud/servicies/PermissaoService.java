package com.br.sfb.crcjud.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.sfb.crcjud.entities.Permissao;
import com.br.sfb.crcjud.repository.PermissaoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class PermissaoService {


	@Autowired()
	private PermissaoRepository permissaoRepository;
	
	public Mono<Permissao> savePermissao(Permissao permissao) {	
		return permissaoRepository.save(permissao);
		
	}
	public void updatePermissao() {
		
		
	}
	public void deletePermissao() {
		
		
	}
	public Flux<Permissao> findAllPermissao() {
		return permissaoRepository.findAll();		
		
	}
	
}

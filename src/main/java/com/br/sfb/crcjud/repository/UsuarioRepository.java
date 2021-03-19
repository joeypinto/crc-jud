package com.br.sfb.crcjud.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.br.sfb.crcjud.entities.Usuario;

import reactor.core.publisher.Mono;
@Repository
public interface UsuarioRepository extends ReactiveMongoRepository<Usuario, String> {
	  Mono<Usuario> findByNome(String nome);
}

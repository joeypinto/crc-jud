package com.br.sfb.crcjud.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.br.sfb.crcjud.entities.Grupo;
@Repository
public interface GrupoRepository extends ReactiveMongoRepository<Grupo, String> {
	
}

package com.br.sfb.crcjud.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.br.sfb.crcjud.entities.Entidade;
@Repository
public interface EntidadeRepository extends ReactiveMongoRepository<Entidade, String>{

}

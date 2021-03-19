package com.br.sfb.crcjud.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.br.sfb.crcjud.entities.Uf;

@Repository
public interface UfRepository  extends ReactiveMongoRepository<Uf, String>{

}

package com.br.sfb.crcjud.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.br.sfb.crcjud.entities.Vara;

@Repository
public interface VaraRepository extends ReactiveMongoRepository<Vara, String>{


}

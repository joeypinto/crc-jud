package com.br.sfb.crcjud.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.sfb.crcjud.entities.Vara;
import com.br.sfb.crcjud.repository.VaraRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VaraService {

	@Autowired()
	private VaraRepository varaRepository;

	
	public Mono<Vara> save() {
		Vara vara = new Vara();
		vara.setCidade("oii");
		vara.setEntidade("teste");
		
		return varaRepository.save(vara);

	}
	public Flux<Vara> findAll() {
		
		return varaRepository.findAll();
		
	}
}

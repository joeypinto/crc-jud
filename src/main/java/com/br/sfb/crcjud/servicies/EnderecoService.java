package com.br.sfb.crcjud.servicies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.br.sfb.crcjud.entities.Cidade;
import com.br.sfb.crcjud.entities.Grupo;
import com.br.sfb.crcjud.entities.Permissao;
import com.br.sfb.crcjud.entities.Uf;
import com.br.sfb.crcjud.entities.Usuario;
import com.br.sfb.crcjud.repository.CidadeRepository;
import com.br.sfb.crcjud.repository.UfRepository;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EnderecoService {

	@Autowired
	private UfRepository ufRepository;
	@Autowired
	private CidadeRepository cidadeRepository;

	public Mono<Cidade> cidadeSave(Cidade cidade) {
		Uf uf = new Uf();
		uf.setCodIbge(2222);
		uf.setNome_uf("São Paulo");
		uf.setSigla_uf("SP");
		ufRepository.save(uf).block();

		List<Uf> list1 = ufRepository.findAll().collectList().block();
		list1.forEach(System.out::println);
		cidade.setCidades(list1);

		
		//Disposable tt = ufRepository.save(uf).doOnNext(result -> cidade.setCidades(new HashSet<>(Arrays.asList(result)))).subscribe();
		//l = (Arrays.asList(ufRepository.findAll().));
	
		System.out.println(cidade.getCidades());
		return cidadeRepository.insert(cidade);

	}
	public Flux<Cidade> findAllPermissao() {
		return cidadeRepository.findAll();		
		
	}
	public Flux<Uf> findAllUf() {
		return ufRepository.findAll();		
		
	}
}

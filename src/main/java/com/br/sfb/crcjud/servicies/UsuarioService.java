package com.br.sfb.crcjud.servicies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.br.sfb.crcjud.entities.Grupo;
import com.br.sfb.crcjud.entities.Usuario;
import com.br.sfb.crcjud.repository.GrupoRepository;
import com.br.sfb.crcjud.repository.UsuarioRepository;

import reactor.core.Disposable;
import reactor.core.publisher.Mono;
@Service
public class UsuarioService{
	@Autowired
	private UsuarioRepository usuario;
	@Autowired
	private GrupoRepository grupo;
	
	
	public Mono<Usuario> save(Usuario permissao) {
		Grupo g = new Grupo();
		g.setNome("teste");
//		Grupo g3 = new Grupo();
//		g3.setNome("testrewe");
		List<Grupo> l = new ArrayList<>();
//		l.add(g);
//		l.add(g3);
		BCryptPasswordEncoder encore = new BCryptPasswordEncoder();
		permissao.setPassword(encore.encode(permissao.getPassword()));
//		Disposable tt = grupo.save(g).doOnNext(result -> l.add(result))
//		  .subscribe();

		List<Grupo> list1 = grupo.findAll().collectList().block();
		list1.forEach(System.out::println);
		permissao.setGrupos(list1);

		return usuario.save(permissao);
	
	}
		
	

}
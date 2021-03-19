package com.br.sfb.crcjud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.sfb.crcjud.servicies.GrupoService;

@RestController
@RequestMapping("/grupo")
public class GrupoController {
	@Autowired
	private GrupoService grupoService;
	
//	@PostMapping
//	public  Mono<Grupo> cadastrarPermissao(@RequestBody Grupo permissao) {		
//		Grupo n = new Grupo();
//		Permissao p = new Permissao();
//		p.setNome("Jotfgãrdfsdfso");
//		p.setId("60315252dadfae5a5a09bd11");
//		n.setNome("teste");
//		ArrayList<Permissao> l = new ArrayList<>();
//		l.add(p);
//		n.setPermissoes(l);
//		
//		return grupoService.savePermissao(n);
//
//	}
}

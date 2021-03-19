package com.br.sfb.crcjud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.sfb.crcjud.entities.Permissao;
import com.br.sfb.crcjud.servicies.PermissaoService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/permissao")
public class PermissaoController {
	
	@Autowired
	private PermissaoService permissaoService;
	
	@PostMapping
	public  Mono<Permissao> cadastrarPermissao(@RequestBody Permissao permissao) {		
		return permissaoService.savePermissao(permissao);

	}
	@GetMapping()  
    public Flux<Permissao> addKayak() {  
        return permissaoService.findAllPermissao();  
    }
}

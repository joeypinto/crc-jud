package com.br.sfb.crcjud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.br.sfb.crcjud.entities.Cidade;
import com.br.sfb.crcjud.entities.Permissao;
import com.br.sfb.crcjud.entities.Usuario;
import com.br.sfb.crcjud.entities.Vara;
import com.br.sfb.crcjud.servicies.EnderecoService;
import com.br.sfb.crcjud.servicies.UsuarioService;
import com.br.sfb.crcjud.servicies.VaraService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



@Controller
@RequestMapping(path = "/teste")
public class TesteController {

	@Autowired
	private UsuarioService usuario;
	@Autowired
	private EnderecoService endereco;
	
	@GetMapping()  
    public @ResponseBody Mono<Usuario> addKayak1() {  
		Usuario user = new Usuario();
		user.setAtivo(true);
		user.setNome("john");
		user.setPassword("1234");
		user.setUsername("john");
//		user.setSenha("1234");
//		user.setEmail("john@nada.com");
        return this.usuario.save(user);  
    }  
	@GetMapping("/t")  
    public @ResponseBody Mono<Cidade> addKayak12() {  
		 System.out.println("Testes3");
			Cidade cidade = new Cidade();
			//cidade.setCodigo("222");
			cidade.setNome_municipio("Sao Paulo");
			 System.out.println("Testes");
			 
        return this.endereco.cidadeSave(cidade);  
    } 
	
	@PostMapping
	public  Mono<Usuario> cadastrarPermissao(@RequestBody Usuario permissao) {		
		return usuario.save(permissao);

	}
//	@GetMapping()  
//    public @ResponseBody Flux<Vara> addKayak() {  
//        return testeRepository.findAll();  
//    }

}

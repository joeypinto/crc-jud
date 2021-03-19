package com.br.sfb.crcjud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.br.sfb.crcjud.entities.Uf;
import com.br.sfb.crcjud.servicies.EnderecoService;
import com.br.sfb.crcjud.servicies.UsuarioService;
import reactor.core.publisher.Flux;



@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/enderecos")
public class EnderecoController {
	

	@Autowired
	private UsuarioService usuario;
	@Autowired
	private EnderecoService enderecoService;
	

//@GetMapping()  
//public @ResponseBody Mono<Usuario> addKayak1() {  
//	Usuario user = new Usuario();
//	user.setAtivo(true);
//	user.setNome("johsnf"); 
//	user.setPassword("1234");
//	user.setUsername("johsnf");
////	user.setSenha("1234");
////	user.setEmail("john@nada.com");
//    return this.usuario.save(user);  
//}  
	
	
	@GetMapping("/{nome_uf}")
	@ResponseBody()
    public Flux<Uf> enderecoAll(@PathVariable("nome_uf") String nome_uf) {  
		
        return enderecoService.findAllUf();  
    }
}
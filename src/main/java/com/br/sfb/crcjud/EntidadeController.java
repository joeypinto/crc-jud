package com.br.sfb.crcjud;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;
import com.br.sfb.crcjud.entities.Entidade;
import com.br.sfb.crcjud.entities.Usuario;
import com.br.sfb.crcjud.repository.UfRepository;

import reactor.core.publisher.Mono;

@Controller
@RequestMapping("/entidade")
public class EntidadeController {
	//@Autowired
	//private EntidadeRepository entidadeRepository;
	@Autowired
	private UfRepository uf;
	
	@GetMapping()
    public String index(final Model model) {
		 //List<String> movie = new ArrayList<>();
		 //Flux<String> movie = Flux.just("São Paulo","Rio de Janeiro");
//		 movie.add("São Paulo");
//		 movie.add("Rio de Janeiro");
//		 movie.add("Brasilia");
//		 System.out.println(movie.get(1).toString());
		
		 IReactiveDataDriverContextVariable reactiveDataDrivenMode =  new ReactiveDataDriverContextVariable(uf.findAll(), 1);
         model.addAttribute("movie",reactiveDataDrivenMode);
         return "entidade";  
    }
	@PostMapping
	public String cadastrarPermissao(@ModelAttribute Entidade entidade,Model model) {
		
		System.out.println(entidade);
		IReactiveDataDriverContextVariable reactiveDataDrivenMode =  new ReactiveDataDriverContextVariable(uf.findAll(), 1);
		//model.addAttribute("modelkey", "modelvalue");
		
		model.addAttribute("movie",reactiveDataDrivenMode);
		//model.addAttribute("mensagem","Cadastrado com Sucesso");
		return "entidade_list";
	}
}

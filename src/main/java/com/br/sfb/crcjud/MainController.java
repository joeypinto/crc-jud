package com.br.sfb.crcjud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

import com.br.sfb.crcjud.servicies.PermissaoService;

@Controller
public class MainController {
	
	@Autowired
	private PermissaoService permissaoService;

	/*
	 * Controlador baseado em anotação Spring WebFlux. Envolve os  dados com
	 * ReactiveDataDriverContextVariable, ele habilitará o  modelo acionado por
	 * dados reativo no modelo Thymeleaf.
	 */    
	
@GetMapping("/index2")
    public String index2(final Model model) {
    	 IReactiveDataDriverContextVariable reactiveDataDrivenMode =
               new ReactiveDataDriverContextVariable(permissaoService.findAllPermissao(), 1);
        model.addAttribute("permissao", reactiveDataDrivenMode);
        return "index2";  
    }
	
	
//	  /** Home page. */
//    @RequestMapping("/index.html")
//    public Mono<String> index() {
//        return Mono.just("index3");
//    }
//    @RequestMapping("/")
//    public Mono<String> root() {    	
//        return Mono.just("redirect:/index.html");
//    }

}
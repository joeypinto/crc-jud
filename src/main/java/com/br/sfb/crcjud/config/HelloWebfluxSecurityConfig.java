package com.br.sfb.crcjud.config;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.authentication.UserDetailsRepositoryReactiveAuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authentication.logout.RedirectServerLogoutSuccessHandler;

import com.br.sfb.crcjud.servicies.UserDetailsService;
//Para ativar o suporte ao WebFlux no Spring Security 5, só precisamos especificar a @EnableWebFluxSecurity anotação:
@EnableWebFluxSecurity
@EnableReactiveMethodSecurity
public class HelloWebfluxSecurityConfig {
	final RedirectServerLogoutSuccessHandler logoutSuccessHandler = new RedirectServerLogoutSuccessHandler();
	@Bean
    ReactiveAuthenticationManager authenticationManager(UserDetailsService userDetailsService) {		   
			var authManager = new UserDetailsRepositoryReactiveAuthenticationManager(userDetailsService);			
	        authManager.setPasswordEncoder(passwordEncoder());
	        return authManager;

    }

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
    	 return http.httpBasic().and()
    	            .authorizeExchange().pathMatchers("/teste/**","/enderecos/**").permitAll()
    	            .anyExchange().authenticated()
    	            .and()
    	            .formLogin()
    	            .and().csrf().disable()
    	            .build();
    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
}
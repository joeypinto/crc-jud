package com.br.sfb.crcjud.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.br.sfb.crcjud.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class UserDetailsService implements ReactiveUserDetailsService {
	
	@Autowired
	private UsuarioRepository userRepository;
	@Override
	public Mono<UserDetails> findByUsername(String username) {	
		System.out.println(username);
		System.out.println(userRepository.findByNome(username).cast(UserDetails.class));
		        return userRepository.findByNome(username)
		            .cast(UserDetails.class);
		   
	}

}

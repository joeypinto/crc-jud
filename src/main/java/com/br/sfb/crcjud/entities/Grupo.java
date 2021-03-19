package com.br.sfb.crcjud.entities;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="grupo")
public class Grupo{

	
	private Long codigo;
	private String nome;
	@DBRef(lazy = true)
	private List<Permissao> permissoes;

	
}

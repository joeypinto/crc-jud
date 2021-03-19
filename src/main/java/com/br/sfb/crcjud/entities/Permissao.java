package com.br.sfb.crcjud.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document(collection="permissao")
public class Permissao {


	@Id
	private String id;
	private String nome;


}

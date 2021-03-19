package com.br.sfb.crcjud.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document(collection="entidade")
public class Entidade {

	@Id
	private String id;
	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	private String cidade;
	
}

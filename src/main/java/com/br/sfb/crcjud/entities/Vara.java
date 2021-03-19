package com.br.sfb.crcjud.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection= "vara")
public class Vara {
	
@Id
private String id;
private String nome;
private String cidade;
private String entidade;
}

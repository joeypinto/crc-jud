package com.br.sfb.crcjud.entities;

import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="estado")

public class Uf {   	 

	 @Id	
	 private String id;
	 private long codIbge;
	 private String nome_uf;
	 private String sigla_uf;	 
//	 //@DBRef
	 //private Set<String> cidades; 

	}
package com.br.sfb.crcjud.entities;





import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="cidade")
public class Cidade {
	
	@Id
    private String id;	 
	private String codigoIBGE;	
	private String nome_municipio;
	private List<Uf> cidades;



 

}

package com.RestPalavras.RestPalavras.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RestPalavras.RestPalavras.models.Palavra;
import com.RestPalavras.RestPalavras.repository.Palavras;

@RestController
@RequestMapping("/palavras")
public class PalavraResource {
	@Autowired
	private Palavras palavras;
	
	@PostMapping 
	public Palavra adicionar(@Valid @RequestBody Palavra palavra) {
		return palavras.save(palavra);
	}
	
	@GetMapping
	public List<Palavra> listar(){

		return palavras.findAll();
	}
}

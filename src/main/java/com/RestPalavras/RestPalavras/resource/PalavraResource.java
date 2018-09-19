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
		//INICIO DA CONTAGEM DA OPERAÇÃO//
		long tempoInicial = System.currentTimeMillis();
			String palavraCompleta = palavra.getString();
			palavraCompleta.toLowerCase();
			char[] c = new char[palavraCompleta.length()];
			//RECEBENDO LETRA//
			for(int i = 0; i < palavraCompleta.length(); i++){
				c[i] = palavraCompleta.charAt(i);
			}
		int letrasIguais = 0;
			for(int i = 0; i < palavraCompleta.length()-1; i++){
				if(c[i] == c[i+1]){
					letrasIguais++;
				}
			}

		//FINAL DA CONTAGEM//
		palavra.setVogal(Integer.toString(letrasIguais));
		long tempoFinal = System.currentTimeMillis() - tempoInicial;
		palavra.setTempoTotal(tempoFinal +"ms");
		return palavras.save(palavra);
	}
	
	@GetMapping
	public List<Palavra> listar(){

		return palavras.findAll();
	}
}

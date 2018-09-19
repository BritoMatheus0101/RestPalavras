package com.RestPalavras.RestPalavras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RestPalavras.RestPalavras.models.Palavra;

public interface Palavras extends JpaRepository<Palavra, String>{

}

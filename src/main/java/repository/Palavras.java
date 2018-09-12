package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Palavra;

public interface Palavras extends JpaRepository<Palavra, String>{

}

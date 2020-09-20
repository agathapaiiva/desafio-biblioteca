package com.br.codar.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.codar.biblioteca.models.Livro;

//JPARepository, possui varios métodos prontos para fazer persistencia no banco de dados | save, delete etc
public interface LivroRepository extends JpaRepository<Livro, Long>{

	Livro findAllById(long id);

}

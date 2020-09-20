package com.br.codar.biblioteca.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.codar.biblioteca.models.Livro;
import com.br.codar.biblioteca.repository.LivroRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(
	    origins = {"*"}
	)
@RestController
@RequestMapping({"/api"})
@Api("API REST Biblioteca")
public class BibliotecaController {
	  private static Logger LOGGER = Logger.getLogger("InfoLogging");
	
	@Autowired
	LivroRepository livroRepository;
	
	public BibliotecaController() {}
	
    @GetMapping({"/livros"})
    @ApiOperation("Retorna uma lista de livros")
	public List<Livro> listLivro(){
		LOGGER.info("Listou todos os livros");
		return this.livroRepository.findAll();
	}
    
    
    @GetMapping({"/livro/{id}"})
    @ApiOperation("Retorna um livro único pelo ID")
    public Livro listaLivroUnico(@PathVariable("id") long id) {
    	LOGGER.info("Listou o livro pelo ID");
    	return this.livroRepository.findAllById(id);
    }
    
    @PostMapping({"/livro"})
    @ApiOperation("Salva um livro")
    public Livro salvaLivro(@RequestBody Livro livro) {
    	LOGGER.info("Salvou o livro cadastrado");
    	return(Livro)this.livroRepository.save(livro);
    }
    
    @DeleteMapping({"/livro"})
    @ApiOperation("Deleta um livro")
    public void deletaLivro(@RequestBody Livro livro) {
    	LOGGER.info("Deletou um livro");
        this.livroRepository.delete(livro);
    }

    @PutMapping({"/livro"})
    @ApiOperation("Atualiza um livro")
    public Livro atualizaLivro(@RequestBody Livro livro) {
    	LOGGER.info("Atualizou o livro");
        return (Livro)this.livroRepository.save(livro);
    }
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package com.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;

@RestController//para informar ao spring q esta classe é um controlador da nossa api rest
@RequestMapping("/postagens") //endereço inicial da controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController {

/*
 * @Autowired indica a injeção de dependência de um repositório (PostagemRepository) para interagir com o banco de dados.
 *  A anotação @CrossOrigin permite requisições de qualquer origem.
 *  @Autowired: Anotação do Spring que indica que a 
 *	instância da classe PostagemRepository será automaticamente injetada aqui.
 */
	
	@Autowired
	private PostagemRepository postagemRepository;
	
	
	}

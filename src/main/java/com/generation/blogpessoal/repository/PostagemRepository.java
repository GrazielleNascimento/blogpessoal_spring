package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;

/*
 *  a Interface PostagemRepository, que irá nos auxiliar na interação com o Banco de dados.
 *   Esta Interface contém diversos Métodos pré-implementados para a geração de consultas SQL, 
 *   que serão utilizadas para manipular os dados da entidade Postagem. Os Métodos pré-implementados realizam ações como: 
 *   Salvar (persistir), Deletar, Consultar e Atualizar dados dos objetos persistidos.

*	Além destes Métodos, a Interface Repository permite criar Métodos, que irão gerar consultas personalizadas. 
*	Estes Métodos são chamados de Query Methods, que veremos como utilizá-los mais a frente.
*	 Para utilizar todos os Métodos da Interface Repository, vamos criar dentro da Interface PostagemRepository uma Herança (extends)
*	  com a Interface JpaRepository. Os Métodos desta Interface serão implementados na próxima etapa, na construção da Classe PostagemController.
	
	 */

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	//Query Method
	public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
	
}

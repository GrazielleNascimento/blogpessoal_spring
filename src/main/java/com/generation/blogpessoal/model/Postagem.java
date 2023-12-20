package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//definir comportamentos para classes e metodos (ANOTACOES))
//AGORA AS ANOTACOES IRAO VIR DE BIBLIOTECAS ESPECIFICAS
@Entity// define que sera uma tabela
@Table(name = "tb_postagens")//nomeia a tabela
public class Postagem {

    @Id// Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO INCREMENT
	private Long id;
	
    /*
     * Para numero - Not null = proibe a ausencia de qualquer coisa
     * Para Texto -- Not blanck = proibe a ausencia de qualquer coisa e tb campos com espaco
     */
    
    //Atributo titulo tem q ter no minimo 5 caracteres e no maximo 100
	@NotBlank(message = "O atributo título é Obrigatório!") 
	@Size(min = 5, max = 100, message = "O atributo título deve conter no mínimo 05 e no máximo 100 caracteres")
	@Column(length= 100) 
	private String titulo;
	
	
	@Column(length= 1000)//sobrescrevendo a quantidade padrao de caracteres maximo
	@NotBlank(message = "O atributo texto é Obrigatório!")
	@Size(min = 10, max = 1000, message = "O atributo texto deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	@ManyToOne //postagem sera o lado N:1 e tera um objeto tema
	@JsonIgnoreProperties("postagem") 
	private Tema tema;

	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;
	
    public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getData() {
        return this.data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
    
    
    
  
}
	


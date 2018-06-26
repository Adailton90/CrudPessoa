package com.Pessoa.Pessoa.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="codigo")
	private Long codigo;
	
	@Column(nullable=false, length = 255)
	private String nome;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="nascimento",nullable=false)
	private Date nascimento;
	
	@Column(name="salario")
	private float salario;

	
	public Pessoa() {
		
	}


	public Pessoa(Long codigo, String nome, Date nascimento, float salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.nascimento = nascimento;
		this.salario = salario;
	}


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getNascimento() {
		return nascimento;
	}


	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
}

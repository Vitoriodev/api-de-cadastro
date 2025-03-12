package com.vitoriodev.cadastro;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// JPA = Java Persistence API

// Entity ele faz com que a classe seja uma entidade do banco de dados
@Entity
@Table(name = "tb_cadastro_de_pessoas")
public class PesssoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento, ele vai passa uma estrateira chave para cada pessoa.
    long id;
    String nome;
    String email;
    int idade;

    public PesssoaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    

}

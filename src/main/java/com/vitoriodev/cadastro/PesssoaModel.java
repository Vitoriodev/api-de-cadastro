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
    private long id;
    private String nome;
    private String email;
    private int idade;

    public PesssoaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    

}

package com.felliperocha.academia.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Categoria extends AbstractDomain {

    private String nome;

    @OneToMany(mappedBy = "categoria")
    private List<Exercicio> exercicios = new ArrayList<>();

    public Categoria(){

    }

    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }
}

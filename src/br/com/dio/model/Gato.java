package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private String nome;
    private String cor;
    private Integer idade;

    public Gato() {

    }

    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}
 class Livros {
    private String nome;
    private Integer numPaginas;

     public Livros(String nome, Integer numPaginas) {
         this.nome = nome;
         this.numPaginas = numPaginas;
     }

     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public Integer getNumPaginas() {
         return numPaginas;
     }

     public void setNumPaginas(Integer numPaginas) {
         this.numPaginas = numPaginas;
     }

     @Override
     public String toString() {
         return "Livros{" +
                 "nome='" + nome + '\'' +
                 ", numPaginas=" + numPaginas +
                 '}';
     }
 }


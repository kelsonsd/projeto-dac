package br.edu.ifpb.dac.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 *
 * @author kelsonsd
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Livro implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String titulo;
    private String idioma;
    private int anoPublicacao;    
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Autor> listaAutores;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Edicao> listaEdicoes;

    public Livro() {
    }
    
    public Livro(String titulo, String idioma, int anoPublicacao, List<Autor> listaAutores, List<Edicao> listaEdicoes) {        
        this.titulo = titulo;
        this.idioma = idioma;
        this.anoPublicacao = anoPublicacao;
        this.listaAutores = listaAutores;
        this.listaEdicoes = listaEdicoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public List<Autor> getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(List<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }

    public List<Edicao> getListaEdicoes() {
        return listaEdicoes;
    }

    public void setListaEdicoes(List<Edicao> listaEdicoes) {
        this.listaEdicoes = listaEdicoes;
    }    
}
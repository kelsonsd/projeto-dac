package br.edu.ifpb.dac.entidades;

import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author kelsonsd
 */

@Entity
public class LivroFiccao extends Livro {
    private String genero;

    public LivroFiccao() {
    }

    public LivroFiccao(String genero, int codigo, String titulo, String idioma, int anoPublicacao, List<Autor> listaAutores, List<Edicao> listaEdicoes) {
        super(titulo, idioma, anoPublicacao, listaAutores, listaEdicoes);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }    
}
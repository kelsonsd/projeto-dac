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

    public LivroFiccao(String genero, String titulo, String idioma, int anoPublicacao, List<Autor> listaAutores,
           List<Edicao> listaEdicoes, Editora editora) {
        
        super(titulo, idioma, anoPublicacao, listaAutores, listaEdicoes, editora);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }    
}
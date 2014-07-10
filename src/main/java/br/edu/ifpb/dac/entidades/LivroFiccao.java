package br.edu.ifpb.dac.entidades;

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

    public LivroFiccao(String titulo, String idioma, int anoPublicacao, String genero) {        
        super(titulo, idioma, anoPublicacao);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }   
}
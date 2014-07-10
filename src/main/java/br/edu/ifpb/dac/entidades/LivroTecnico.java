package br.edu.ifpb.dac.entidades;

import javax.persistence.Entity;

/**
 *
 * @author kelsonsd
 */

@Entity
public class LivroTecnico extends Livro {    
    private String areaAtuacao;

    public LivroTecnico() {
    }

    public LivroTecnico(String titulo, String idioma, int anoPublicacao, String areaAtuacao) {        
        super(titulo, idioma, anoPublicacao);
        this.areaAtuacao = areaAtuacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }    
}
package br.edu.ifpb.dac.entidades;

import java.util.List;
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

    public LivroTecnico(String areaAtuacao, int codigo, String titulo, String idioma, int anoPublicacao,
           List<Autor> listaAutores, List<Edicao> listaEdicoes, Editora editora) {
        
        super(titulo, idioma, anoPublicacao, listaAutores, listaEdicoes, editora);
        this.areaAtuacao = areaAtuacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }    
}
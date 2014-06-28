package br.edu.ifpb.dac.entidades;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author kelsonsd
 */

@Entity
public class Autor extends Pessoa{    
    private String dataNascimento;    
    private String biografia;
            
    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private List<Livro> listaLivros;    

    public Autor() {
    }

    public Autor(String dataNascimento, String biografia, String nome) {
        super(nome);
        this.dataNascimento = dataNascimento;
        this.biografia = biografia;
    }   

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public List<Livro> getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(List<Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }
}
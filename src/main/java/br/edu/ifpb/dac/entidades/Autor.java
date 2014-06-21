package br.edu.ifpb.dac.entidades;

import javax.persistence.Entity;

/**
 *
 * @author kelsonsd
 */

@Entity
public class Autor extends Pessoa{    
    private String dataNascimento;    
    private String biografia;  

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
}
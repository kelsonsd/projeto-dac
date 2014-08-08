package br.edu.ifpb.dac.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author kelsonsd
 */

@Entity
public class Autor extends Pessoa {
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;    
    
    @Basic(fetch = FetchType.LAZY)
    private String biografia;
    
    @ManyToMany(mappedBy = "listaAutores")
    private List<Livro> listaLivros;

    public Autor() {
    }

    public Autor(Date dataNascimento, String biografia, String nome) {
        super(nome);
        this.dataNascimento = dataNascimento;
        this.biografia = biografia;
    }   

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
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
    
    private String getDataText() {        
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(dataNascimento);        
    }
    
    @Override
    public String toString() {
        return "Nome: " + getNome() + " - Nascimento: " + getDataText();
    }    
}
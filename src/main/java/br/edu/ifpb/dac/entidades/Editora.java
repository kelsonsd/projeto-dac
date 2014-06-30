package br.edu.ifpb.dac.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author kelsonsd
 */

@Entity
public class Editora implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String telefone;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Edicao> listaEdicoes;

    public Editora() {
    }

    public Editora(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Edicao> getListaEdicoes() {
        return listaEdicoes;
    }

    public void setListaEdicoes(List<Edicao> listaEdicoes) {
        this.listaEdicoes = listaEdicoes;
    }    

    @Override
    public String toString() {
        return nome;
    }
}
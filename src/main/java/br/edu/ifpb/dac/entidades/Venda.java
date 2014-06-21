package br.edu.ifpb.dac.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author kelsonsd
 */

@Entity
public class Venda implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String dataVenda;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Edicao> edicoes;

    public Venda() {
    }

    public Venda(String dataVenda, List<Edicao> edicoes) {
        this.dataVenda = dataVenda;
        this.edicoes = edicoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
    
    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public List<Edicao> getEdicoes() {
        return edicoes;
    }

    public void setEdicoes(List<Edicao> edicoes) {
        this.edicoes = edicoes;
    }
}
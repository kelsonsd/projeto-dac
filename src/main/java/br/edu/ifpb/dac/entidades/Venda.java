package br.edu.ifpb.dac.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author kelsonsd
 */

@Entity
public class Venda implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    
    private String matriculaFuncionario;
    private double total;    
    
    @ManyToMany
    private List<Edicao> edicoes;

    public Venda() {
    }

    public Venda(Date dataVenda, String matriculaFuncionario, double total) {
        this.dataVenda = dataVenda;
        this.matriculaFuncionario = matriculaFuncionario;
        this.total = total;        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
    
    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public List<Edicao> getEdicoes() {
        return edicoes;
    }

    public void setEdicoes(List<Edicao> edicoes) {
        this.edicoes = edicoes;
    }
    
    public String getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(String matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
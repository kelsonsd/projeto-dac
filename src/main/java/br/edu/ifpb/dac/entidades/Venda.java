package br.edu.ifpb.dac.entidades;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
    private Long id;
        
    @Temporal(TemporalType.DATE)    
    private Date dataVenda;    
    
    @Column(unique = true)
    private String matriculaFuncionario;
    private double total;    
    
    @ManyToOne
    private Funcionario funcionario;
    
    @ManyToMany
    private List<Edicao> listaEdicoes;

    public Venda() {
    }

    public Venda(Date dataVenda, String matriculaFuncionario, double total) {
        this.dataVenda = dataVenda;
        this.matriculaFuncionario = matriculaFuncionario;
        this.total = total;        
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }    
    
    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
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
    
    public List<Edicao> getListaEdicoes() {
        return listaEdicoes;
    }

    public void setListaEdicoes(List<Edicao> listaEdicoes) {
        this.listaEdicoes = listaEdicoes;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    private String getData() {        
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(dataVenda);
    }
    

    @Override
    public String toString() {
        return "Data: " + getData() + " - Matrícula: " + matriculaFuncionario + " - Total: R$ " + total;
    }
}
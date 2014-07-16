package br.edu.ifpb.dac.entidades;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author kelsonsd
 */

@Entity
public class Funcionario extends Pessoa {
    @Column(unique = true)
    private String matricula;    
    private String funcao;    
    
    @OneToOne(cascade = CascadeType.ALL)    
    private Endereco endereco;
        
    @OneToMany(mappedBy = "funcionario")
    private List<Venda> listVendas;

    public Funcionario() {
    }
    
    public Funcionario(String matricula, String funcao, String nome, Endereco endereco) {
        super(nome);
        this.matricula = matricula;
        this.funcao = funcao;
        this.endereco = endereco;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public List<Venda> getListVendas() {
        return listVendas;
    }

    public void setListVendas(List<Venda> listVendas) {
        this.listVendas = listVendas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }    

    @Override
    public String toString() {
        return "Nome: " + getNome() + " Matrícula: " + matricula + " Função: " + funcao
            + " Endereço - " + endereco;
    }    
}
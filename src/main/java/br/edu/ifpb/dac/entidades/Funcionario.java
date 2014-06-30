package br.edu.ifpb.dac.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author kelsonsd
 */

@Entity
public class Funcionario extends Pessoa {
    private String matricula;
    private String funcao;    
    
    @OneToMany
    private List<Venda> listVendas;

    public Funcionario() {
    }
    
    public Funcionario(String matricula, String funcao, String nome) {
        super(nome);
        this.matricula = matricula;
        this.funcao = funcao;
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

    @Override
    public String toString() {
        return "Nome: " + getNome() + " - Matrícula: " + matricula + " - Função: " + funcao;
    }    
}
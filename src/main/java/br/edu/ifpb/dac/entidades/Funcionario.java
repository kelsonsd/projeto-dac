package br.edu.ifpb.dac.entidades;

import javax.persistence.Entity;

/**
 *
 * @author kelsonsd
 */

@Entity
public class Funcionario extends Pessoa {
    private String matricula;
    private String funcao;

    public Funcionario() {
    }
    
    public Funcionario(String matricula, String funcao, int codigo, String nome) {
        super(codigo, nome);
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
}
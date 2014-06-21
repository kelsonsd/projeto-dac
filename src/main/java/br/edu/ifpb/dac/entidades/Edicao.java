package br.edu.ifpb.dac.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author kelsonsd
 */

@Entity
public class Edicao implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String isbn;
    private int numero;
    private double valor;
    private String ano;
    private int numPaginas;
    private int qtdeEstoque;    

    public Edicao() {
    }

    public Edicao(String isbn, int numero, double valor, String ano, int numPaginas, int qtdeEstoque) {
        this.isbn = isbn;
        this.numero = numero;
        this.valor = valor;
        this.ano = ano;
        this.numPaginas = numPaginas;
        this.qtdeEstoque = qtdeEstoque;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }
}
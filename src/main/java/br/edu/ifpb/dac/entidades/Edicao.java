package br.edu.ifpb.dac.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import org.eclipse.persistence.annotations.PrimaryKey;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author kelsonsd
 */

@Entity
@PrimaryKey
public class Edicao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Id
    private String isbn;
    private int numero;
    private double preco;
    private int ano;
    private int numPaginas;
    private int qtdeEstoque;
    
    @Id
    @OneToOne()
    private Editora editora;    
    
    @ManyToMany(mappedBy = "listaEdicoes")
    private List<Venda> listaVendas;

    public Edicao() {
    }

    public Edicao(String isbn, int numero, double valor, int ano, int numPaginas, int qtdeEstoque) {
        this.isbn = isbn;
        this.numero = numero;
        this.preco = valor;
        this.ano = ano;
        this.numPaginas = numPaginas;
        this.qtdeEstoque = qtdeEstoque;        
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double valor) {
        this.preco = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
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

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public List<Venda> getListaVendas() {
        return listaVendas;
    }

    public void setListaVendas(List<Venda> listaVendas) {
        this.listaVendas = listaVendas;
    }    

    @Override
    public String toString() {
        return "ISBN: " + isbn + " Nº: " + numero + " Estoque: " + qtdeEstoque;
    }    
}
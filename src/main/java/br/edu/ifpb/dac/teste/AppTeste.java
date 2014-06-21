package br.edu.ifpb.dac.teste;

import br.edu.ifpb.dac.entidades.Autor;
import br.edu.ifpb.dac.entidades.Livro;
import br.edu.ifpb.dac.entidades.LivroFiccao;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kelsonsd
 */
public class AppTeste {    
    
    public static void main(String[] args) {
        DAO dao = new DaoJPA("projeto-dac");
        
        LivroFiccao livro = new LivroFiccao();
        Autor autor = new Autor();
        List<Autor> autores = new ArrayList<>();
        
        livro.setTitulo("Livro-Teste-2");
        livro.setIdioma("Italiano");
        livro.setAnoPublicacao(1930);
        livro.setGenero("BOM-2");
        
        autor.setNome("Kelson-2");
        Date date = new Date();
        date.setDate(4);
        date.setMonth(12);
        date.setYear(1990);
        
        autor.setDataNascimento("04/12/1990");
        
        autor.setBiografia("Biografia Teste 2");        
        autores.add(autor);
        
        livro.setListaAutores(autores);
        
        dao.salvar(livro);        
        
//        Livro ficcao = (Livro) dao.buscar(Livro.class, 1);      
//        
//        dao.remover(ficcao);
        
    }
}
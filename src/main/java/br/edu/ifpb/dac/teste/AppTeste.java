package br.edu.ifpb.dac.teste;

import br.edu.ifpb.dac.entidades.Autor;
import br.edu.ifpb.dac.entidades.Editora;
import br.edu.ifpb.dac.entidades.LivroFiccao;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;

/**
 *
 * @author kelsonsd
 */
public class AppTeste extends javax.swing.JFrame{    
    
    public static void main(String[] args) throws InterruptedException {
        DAO dao = new DaoJPA("projeto-dac");
        
//        LivroFiccao livro = new LivroFiccao();
//        Autor autor = new Autor();
//        List<Autor> autores = new ArrayList<>();
//        
//        livro.setTitulo("Livro-Teste-2");
//        livro.setIdioma("Italiano");
//        livro.setAnoPublicacao(1930);
//        livro.setGenero("BOM-2");
//        
//        autor.setNome("Kelson-2");
//        Date date = new Date();
//        date.setDate(4);
//        date.setMonth(12);
//        date.setYear(1990);
//        
//        autor.setDataNascimento("04/12/1990");
//        
//        autor.setBiografia("Biografia Teste 2");        
//        autores.add(autor);
//        
//        livro.setListaAutores(autores);
        
        //dao.salvar(livro);  
        
        Panel pnlBotoes = new Panel();  
GridLayout layoutBotoes = new GridLayout(7,7);  
pnlBotoes.setLayout(layoutBotoes);  
Button botoes[][] = new Button[7][7];  
for(int i=0;i<7;i++){  
    for(int c=0;c<7;c++){  
       botoes[i][c] = new Button();  
       pnlBotoes.add(botoes[i][c]); 
        System.out.println("oii");
    }  
}

pnlBotoes.setVisible(true);
        
        LivroFiccao livroFiccaos = (LivroFiccao) dao.buscar(LivroFiccao.class, 5);
    
        
        
        for (int i = 0; i < livroFiccaos.getListaAutores().size(); i++) {
            System.out.println(livroFiccaos.getListaAutores().get(i).getNome());
        }
        
        
//      Livro ficcao = (Livro) dao.buscar(Livro.class, 1);
//        
//      dao.remover(ficcao);
        
        
    }
}
package br.edu.ifpb.dac.controle;

import br.edu.ifpb.dac.entidades.Autor;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 */

public class AutorControle {
    
    private Date formatarData(String data) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return new Date(formatter.parse(data).getTime());
    }
 
    public boolean salvar(String nome, String nascimento, String biografia) throws ParseException {
        if(nome.isEmpty() || nascimento == null || biografia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe todos os campos ou verifique se a data está correta!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else {                                 
            Autor autor = new Autor(formatarData(nascimento), biografia, nome);        
            return new DaoJPA<Autor>().salvar(autor);        
        }
    }
    
    public boolean atualizar(String nome, String nascimento, String biografia, Autor autor) throws ParseException {
        if(nome.isEmpty() || nascimento == null || biografia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe todos os campos ou verifique se a data está correta!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else {
            autor.setNome(nome);
            autor.setDataNascimento(formatarData(nascimento));
            autor.setBiografia(biografia);
            return new DaoJPA<Autor>().atualizar(autor);        
        }
    }
    
    public boolean remover(Autor autor) {
        DAO dao = new DaoJPA<>();
        Autor a = (Autor) dao.buscar(Autor.class, autor.getId());        
        return dao.remover(a);
    }
    
    public List<Autor> buscarTodos() {
        return new DaoJPA<Autor>().buscarTodos(Autor.class);
    }
}
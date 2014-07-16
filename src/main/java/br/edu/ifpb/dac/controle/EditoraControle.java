package br.edu.ifpb.dac.controle;

import br.edu.ifpb.dac.entidades.Editora;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 */
public class EditoraControle {
    
    public boolean salvar(String nome, String telefone) {        
        if(nome.isEmpty() || telefone.equals("(  )    -")) {        
            JOptionPane.showMessageDialog(null, "Informe todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);            
            return false;
        }
        else {            
            Editora editora = new Editora(nome, telefone);            
            return new DaoJPA<Editora>().salvar(editora);           
        }
    }    
        
    public boolean atualizar(String nome, String telefone, Editora editora) {
        if(nome.equals("") || telefone.equals("(  )    -")) {
            JOptionPane.showMessageDialog(null, "Informe todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else {                
            editora.setNome(nome);
            editora.setTelefone(telefone);
            return new DaoJPA<Editora>().atualizar(editora);
        }            
    }
    
    public boolean remover(Editora editora) {
        DAO dao = new DaoJPA<>();
        Editora e = (Editora) dao.buscar(Editora.class, editora.getId());        
        return dao.remover(e);
    }    
    
    public List<Editora> buscarTodos() {
        return new DaoJPA<Editora>().buscarTodos(Editora.class);
    }
}
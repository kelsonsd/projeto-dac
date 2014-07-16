package br.edu.ifpb.dac.controle;

import br.edu.ifpb.dac.entidades.Endereco;
import br.edu.ifpb.dac.entidades.Funcionario;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 */

public class FuncionarioControle {
    
    public boolean salvar(String nome, String matricula, String funcao,
            String rua, String numero, String bairro, String cidade, String estado) {
        
        if(nome.isEmpty() || matricula.isEmpty() || funcao.isEmpty() || rua.isEmpty() || numero.isEmpty() ||
            bairro.isEmpty() || cidade.isEmpty() || estado.isEmpty()) {
                        
            JOptionPane.showMessageDialog(null, "Informe todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else {
            DAO dao = new DaoJPA<>();
            List<Funcionario> funcionarios = dao.buscarTodos(Funcionario.class);
            boolean exist = false;
            
            for (Funcionario funcionario : funcionarios) {                        
                if(funcionario.getMatricula().equals(matricula)) {                            
                    exist = true;
                    break;
                }
            }
            Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado);                    
            Funcionario funcionario = new Funcionario(matricula, funcao, nome, endereco);
                    
            if(!exist) {
                if(dao.salvar(funcionario)) {                                                
                    return true;
                }                        
            }
            else {
                JOptionPane.showMessageDialog(null, "Matrícula já cadastrada no sistema!", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
        return false;
    }
    
    public boolean atualizar(String nome, String matricula, String funcao,
            String rua, String numero, String bairro, String cidade, String estado, Funcionario f) {
        
        if(nome.isEmpty() || matricula.isEmpty() || funcao.isEmpty() || rua.isEmpty() || numero.isEmpty() ||
            bairro.isEmpty() || cidade.isEmpty() || estado.isEmpty()) {
                        
            JOptionPane.showMessageDialog(null, "Informe todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else {
            DAO dao = new DaoJPA<>();
            List<Funcionario> funcionarios = dao.buscarTodos(Funcionario.class);
            boolean exist = false;
            
            for (Funcionario funcionario : funcionarios) {                        
                if(funcionario.getMatricula().equals(matricula)) {                            
                    exist = true;
                    break;
                }
            }            
            f.setNome(nome);
            f.setMatricula(matricula);
            f.setFuncao(funcao);
            f.getEndereco().setRua(rua);
            f.getEndereco().setNumero(numero);
            f.getEndereco().setBairro(bairro);
            f.getEndereco().setCidade(cidade);
            f.getEndereco().setEstado(estado);
                    
            if(!exist) {
                if(dao.atualizar(f)) {                                                
                    return true;
                }                        
            }
            else {
                JOptionPane.showMessageDialog(null, "Matrícula já cadastrada no sistema!", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
        return false;
    }
    
    public boolean remover(Funcionario funcionario) {
        DAO dao = new DaoJPA<>();
        Funcionario f = (Funcionario) dao.buscar(Funcionario.class, funcionario.getId());        
        return dao.remover(f);
    }
    
    public List<Funcionario> buscarTodos() {
        return new DaoJPA<Funcionario>().buscarTodos(Funcionario.class);
    }
}
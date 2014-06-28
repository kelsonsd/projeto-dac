package br.edu.ifpb.dac.persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 * @param <T>
 */

public class DaoJPA<T> implements DAO<T>{
    private EntityManagerFactory emf;
    private  EntityManager em;
    
    public DaoJPA(String unidadePersistencia){
        if (emf == null) {    
            emf = Persistence.createEntityManagerFactory(unidadePersistencia);
            em = emf.createEntityManager();
        }        
    }
    
    public DaoJPA(){
        this("projeto-dac");
    }

    @Override
    public boolean salvar(T objeto) {
        try {
            em.getTransaction().begin();
            em.persist(objeto);
            return commitTransaction();
                   
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao adicionar!", "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }        
    }

    @Override
    public T buscar(Class classe, int id) {
        T objLocalizado = null;
        try {
            objLocalizado = (T) em.find(classe, id);
        } catch (IllegalArgumentException ex) {
        }
        return objLocalizado;      
    }
    
    @Override
    public List<T> buscarTodos(Class clazz) {        
        String query = "SELECT x FROM " + clazz.getSimpleName() + " x";
        return em.createQuery(query).getResultList();
    }

    @Override
    public boolean atualizar(T objeto) {
        try {
            em.getTransaction().begin();
            em.merge(objeto);            
            return commitTransaction();
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro na atualização!", "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }        
    }

    @Override
    public boolean remover(T objeto) {
        try {
            em.getTransaction().begin();
            em.remove(objeto);            
            return commitTransaction();
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro na remoção!", "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private boolean commitTransaction() {            
        try {
            em.getTransaction().commit();            
            return true;
        } catch (PersistenceException ex) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();                
            }    
            JOptionPane.showMessageDialog(null, "Não foi possível completar a operação! " + ex.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }        
    }
}
package br.edu.ifpb.dac.persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
            em.getTransaction().commit();            
       
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            return false;
        }
        return true;
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
            em.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            return false;
        }
        return true;
    }

    @Override
    public boolean remover(T objeto) {
        try {
            em.getTransaction().begin();
            em.remove(objeto);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            return false;
        }
        return true;
    } 
}
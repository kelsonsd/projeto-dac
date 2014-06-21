package br.edu.ifpb.dac.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author kelsonsd
 */

public class DaoJPA implements DAO{
    private EntityManagerFactory emf;
    private  EntityManager em;
    
    public DaoJPA(String unidadePersistencia){
        emf = Persistence.createEntityManagerFactory(unidadePersistencia);
        em = emf.createEntityManager();
    }
    
    public DaoJPA(){
        this("projeto-dac");
    }

    @Override
    public void salvar(Object o) {
        try {
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
       
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }        
    }

    @Override
    public Object buscar(Class classe, Object object) {
        return em.find(classe, object);
    }

    @Override
    public void atualizar(Object o) {
        try {
            em.getTransaction().begin();
            em.merge(o);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }

    @Override
    public void deletar(Object o) {
        em.remove(o);
    }
}
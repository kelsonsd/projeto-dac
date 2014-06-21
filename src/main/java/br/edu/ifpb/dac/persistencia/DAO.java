package br.edu.ifpb.dac.persistencia;

/**
 *
 * @author kelsonsd
 */

public interface DAO {
    public void salvar(Object o);
    public Object buscar(Class classe, Object object);
    public void atualizar(Object o);
    public void remover(Object o);
}
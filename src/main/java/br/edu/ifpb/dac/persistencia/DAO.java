package br.edu.ifpb.dac.persistencia;

import java.util.List;

/**
 *
 * @author kelsonsd
 * @param <T>
 */

public interface DAO<T> {
    public boolean salvar(T objeto);
    public T buscar(Class classe, int id);
    public List<T> buscarTodos(Class clazz);
    public boolean atualizar(T objeto);
    public boolean remover(T objeto);    
}
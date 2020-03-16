package daos;

import java.util.List;

public interface DAO<T> {

    public T findbyID(int id);

    public List findAll();

    public T update(T dto);

    public void delete(int id);

}

package collections;

/**
 * Created by BonLa1731834 on 2018-03-12.
 */
public interface List<C> {

    public void add(int index, C element);
    public void add(C element);
    public void set(int index, C element);
    public void remove(int index);
    public C get(int index);
    public int size();
    public void clear();


}

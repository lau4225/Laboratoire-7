package collections;

/**
 * Created by BonLa1731834 on 2018-03-12.
 */
public class File<C> {

    private LinkedList<C> file = new LinkedList();

    public void add(C element){
        file.add(element);
    }

    public C remove(){
        C premier = file.get(0);
        file.remove(0);
        return premier;
    }

    public C peek(){
        return file.get(0);
    }

    public void clear(){
        file.clear();
    }

    public int size(){
        return file.size();
    }
}

package collections;

/**
 * Created by BonLa1731834 on 2018-03-12.
 */
public class Pile<C> {

    private LinkedList<C> pile = new LinkedList();

    public void push(C element){
        pile.add(0, element);
    }

    public C pop(){
        C pop = pile.get(0);
        pile.remove(0);
        return pop;
    }

    public C peek(){
        return pile.get(0);
    }

    public void clear(){
        pile.clear();
    }

    public int size(){
        return pile.size();
    }

}

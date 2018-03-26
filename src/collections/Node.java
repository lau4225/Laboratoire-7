package collections;

/**
 * Created by Bonla1731834 on 2018-03-15.
 */
public class Node <C> {


    private Node next;
    private C value;

    public Node getNext() {return next;}

    public void setNext(Node next) {this.next = next;}

    public C getValue() {return value;}

    public void setValue(C value) {this.value = value;}


}

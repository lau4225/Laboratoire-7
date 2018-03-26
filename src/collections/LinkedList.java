package collections;

/**
 * Created by BonLa1731834 on 2018-03-12.
 */
public class LinkedList<C> implements List<C>{

    private Node<C> head;
    private Node<C> tail;
    private int taille;//combien de noeuds

    private C contenu;

    public void add(int index, C element){

        Node<C> nodeElement = new Node();
        nodeElement.setValue(element);
        Node<C> current = head;
        Node<C> previous = null;

        if (taille==0){
            head = nodeElement;
            tail = nodeElement;
        }
        //ajouter au milieu
        else if (index!=0 && index != taille){
            for (int i=0; i<index; i++){
                previous = current;
                current = current.getNext();
            }
            previous.setNext(nodeElement);
            nodeElement.setNext(current);
        }
        //si on veut ajouter a la fin
        else if (index==taille)
        {
            tail.setNext(nodeElement);
            tail = nodeElement;
        }
        //ajouter au debut
        else if (index==0){
            nodeElement.setNext(head);
            head = nodeElement;
        }


        taille++;
    }

    public void add (C element){
        add(taille,element);
    }

    public void set(int index, C element){ // a faire

        Node<C> nodeElement = new Node();
        nodeElement.setValue(element);

        Node<C> current = head;

        //remplacer au milieu
        if (index!=0 && index != taille) {
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            current.setValue(nodeElement.getValue());
        }
    }

    public C get(int index){

        Node<C> current = head;

        for (int i=0; i<index; i++){
            current = current.getNext();
        }

        return current.getValue();
    }

    public void remove(int index){
        Node<C> current = head;
        Node<C> previous = null;

        //enlever au milieu
        if (index!=0){
            for (int i=0; i<index; i++){
                previous = current;
                current = current.getNext();
            }

            if (index == taille)// si on veut enlever a la fin
            {
                tail = previous;
            }
            previous.setNext(current.getNext());

        }
        //enlever au debut
        else if (index==0){
            head = current.getNext();}

            taille--;
    }

    public void clear(){
        head = null;
        tail = null;
        taille = 0;
    }

    public int size(){
        return taille;
    }

    public Node<C> getFirst(){
        return head;
    }

    public Node<C> getLast(){
        return tail;
    }

}

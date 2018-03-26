package collections;

/**
 * Created by BonLa1731834 on 2018-03-12.
 */
public class ArrayList<C> implements List<C> {

    private C contenu;



    private int taille = 0;//combien d'elements il y a
    private C[] tableau1 = (C[]) new Object[10];

    public void add(int index, C element){

        //si tableau1 est plein
        if (taille== tableau1.length)
        {
            //créer nouveau tableau1 plus gros
            C[] tableau2 = (C[]) new Object[tableau1.length*2];

            //copier coller le premier tableau1
            for (int i = 0; i< tableau1.length; i++){
                tableau2[i]= tableau1[i];
            }

            tableau1 = tableau2; //tableau1 devient tableau2

        }

        //décaler les elements
        for (int i = taille -1 ; i>=index; i--){
            tableau1[i+1] = tableau1[i];
        }

        //inserer element
        tableau1[index]= element;
        taille++;
    }

    public void add (C element){
        add(taille,element);
    }

    public void set(int index, C element){
        tableau1[index]=element;
    }

    public C get(int index){
        return tableau1[index];
    }

    public void remove(int index){
        //décaler les elements + enlever element
        for (int i = index ; i < tableau1.length-1; i++){
            tableau1[i] = tableau1[i+1];
        }
        taille++;
    }

    public void clear(){
        taille = 0;
    }

    public int size(){
        return taille;
    }

}

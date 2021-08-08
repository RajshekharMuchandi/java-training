package rajshekhar.genericsbounded;

import rajshekhar.generics.Display;

public class DisplayGenerics<T extends A> {

     private T t;

     public DisplayGenerics(T t){
        this.t = t;
     }

    public void display(T t){
        System.out.println("======================================================================");
        System.out.println("First parameter" + "value :" + t + " type :" + t.getClass().getName());
    }
}

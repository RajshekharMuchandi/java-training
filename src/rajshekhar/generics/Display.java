package rajshekhar.generics;

public class Display<T,U> {

    private T t;

    private U u;

    public Display(){

    }

    public Display(T t){
        this.t = t;
    }

    public Display(T t, U u){
        this.t = t;
        this.u = u;
    }

    public void display(T t, U u){
        System.out.println("======================================================================");
        System.out.println("First parameter" + "value :" + t + " type :" + t.getClass().getName());
        System.out.println("Second parameter" + "value :" + u + " type :" + u.getClass().getName());
    }
}

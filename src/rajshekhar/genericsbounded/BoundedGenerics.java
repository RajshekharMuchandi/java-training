package rajshekhar.genericsbounded;

public class BoundedGenerics {

    public static void main(String[] args) {

        DisplayGenerics<B> displayGenerics = new DisplayGenerics<>(new B());


        DisplayGenerics<String> displayGenericsC = new DisplayGenerics<>(new B());
    }
}

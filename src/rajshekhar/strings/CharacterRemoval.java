package rajshekhar.strings;

public class CharacterRemoval {

    public static void main(String[] args) {

        String ooctye = "oocyte";
        String boat = "boat";
        String own = "own";

        ooctye = ooctye.replace("o","");
        boat = boat.replace("o","");
        own = own.replace("o","");


        System.out.println(ooctye);
        System.out.println(boat);
        System.out.println(own);
    }
}

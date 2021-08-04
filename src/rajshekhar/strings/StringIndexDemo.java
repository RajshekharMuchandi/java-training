package rajshekhar.strings;

public class StringIndexDemo {

    public static void main(String[] args) {
        System.out.println( isGood("goodboy", "good"));
        System.out.println( isGood("bgoodboy", "good"));
        System.out.println( isGood("gobodboy", "good"));
        System.out.println( isGood("goobdboy", "good"));
        System.out.println( isGood("goodbboy", "good"));
        System.out.println( isGood(null, "good"));
        System.out.println( isGood("hfsgdf", null));
    }

    private static boolean isGood(String str, String key) {
        if(str == null || key == null){
            return false;
        }
        String goodZeroIndex = str.substring(0, key.length());
        String goodFirstIndex = str.substring(1, key.length()+1);
        if(key.equals(goodZeroIndex) || key.equals(goodFirstIndex)){
              return true;
        }
//        System.out.println(goodZeroIndex);
//        System.out.println(goodFirstIndex);
        return false;
    }
}

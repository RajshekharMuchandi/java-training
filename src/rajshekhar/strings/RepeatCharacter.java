package rajshekhar.strings;

public class RepeatCharacter {

    public static void main(String[] args) {
        System.out.println(repeatString("string", 2,3));
        System.out.println(repeatString("string", 3,3));
        System.out.println(repeatString("string", 4,3));
        System.out.println(repeatString("string", 5,3));
        System.out.println(repeatString("string", 6,3));
    }


    private static String repeatString(String input, int index, int times){
        String subPart = input.substring(index, input.length());
        String result = "";
        for(int i = 0; i < 3; i++){
            result = result + subPart;
        }
        return result;
    }
}

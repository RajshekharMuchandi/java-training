package exceptions;

import java.io.*;

public class ExceptionDemo {

    public static void main(String[] args) throws IOException {

        File file = new File("/Users/rajshekhar/Desktop/java8-notes_1.pages");

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
           System.out.println();
        }

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = "";

        while((str = bufferedReader.readLine()) != null){
            System.out.println(str);
        }
    }
}

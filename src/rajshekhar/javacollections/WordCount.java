package rajshekhar.javacollections;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public static void main(String[] args) {
        // input
        String input = "JAVA was developed by James Gosling at Sun Microsystems Inc in the year 1991, later acquired by Oracle Corporation. It is a simple programming language. Java makes writing, compiling, and debugging programming easy. It helps to create reusable code and modular programs. ... The syntax of Java is similar to c/c++.";

        String lowercaseInput = input.toLowerCase();
        // 1. split string based on space
          String [] words = lowercaseInput.split("\\s");

        Map<String,Integer> wordCountMap = new HashMap<>();
        // 2. count the word using hashmap
          for(String word : words){
              if(wordCountMap.get(word) == null){
                  wordCountMap.put(word, 1);
              }else{
                  wordCountMap.put(word, wordCountMap.get(word) + 1);
              }
          }

        // 3. Print the content
          for(Map.Entry<String,Integer> entry : wordCountMap.entrySet()){
              System.out.println(entry.getKey() + " => " + entry.getValue());
          }

    }

    public static int[] fizzArray3(int start, int end) {
        int count = 0;
        int [] result = new int[end-start];
        for(int  i = start; i < end ; i++){
            System.out.println(i);
            count = i;
            result[i] = count++;
        }
        return result;
    }

}

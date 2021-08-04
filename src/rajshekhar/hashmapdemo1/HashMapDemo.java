package rajshekhar.hashmapdemo1;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {


        Map<String,String> map = new HashMap<>();

        // add
        map.put("MH", "Mumbai");
        map.put("KA", "Bengaluru");
        map.put("TN", "Chennai");
        map.put("MH", "Mumbai");

        // iteration : 1
//        Set<String> states = map.keySet();

//        for(String state : map.keySet()){
//            System.out.println(state + " => " + map.get(state));
//        }

        // iteration : 2
//        Set<Map.Entry<String,String>> entries = map.entrySet();

        for(Map.Entry<String,String> entry : map.entrySet()){
           System.out.println(entry.getKey() +" --> " +entry.getValue());
        }


    }
}



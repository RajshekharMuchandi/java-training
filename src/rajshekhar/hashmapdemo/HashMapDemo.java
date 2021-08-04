package rajshekhar.hashmapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap(); // 32 -> 64 -> 128
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        map.put("D", "4");
        map.put("E", "5");
        map.put("F", "6");
        map.put("G", "7");

//        System.out.println(map);

        Set<String> alphabets = map.keySet();

//        Iterator<String> alphaIterator = alphabets.iterator();
//        while(alphaIterator.hasNext()){
//            String key = alphaIterator.next();
//            System.out.println( key+ "->" +map.get(key));
//        }

//        for(String alphabet : map.keySet()){
//            System.out.println(alphabet + " : " + map.get(alphabet));
//        }

        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " @ " + entry.getValue());
        }

    }
}

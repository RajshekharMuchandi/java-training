package rajshekhar.trees;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreesetDemo {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(30);
        set.add(10);

        System.out.println("hashset :" +set);
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(30);
        treeSet.add(10);
        System.out.println("tree set :" +treeSet);

    }
}

package rajshekhar.sort.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingDemo {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(5);
        integers.add(87);
        integers.add(12);
        integers.add(54);
        integers.add(78);
        integers.add(8);

        System.out.println("****** BEFORE SORT********");
        System.out.println(integers);

        // sort
//        Collections.sort(integers);
//        Collections.sort(integers, Collections.reverseOrder());

        System.out.println("****** AFTER SORT********");
        System.out.println(integers);
    }
}

package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {
        
        List<Integer> ar = new ArrayList<>();
        ar.add(55);
        ar.add(65);
        ar.add(3);
        ar.add(48);
        ar.add(29);
        ar.add(90);
        ar.add(43);

        System.out.println(ar);
        Collections.sort(ar);   // sorting using collections class
        System.out.println(ar);
    }
}

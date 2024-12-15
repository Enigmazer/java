package study;

import java.util.*;

// collection is an Interface
/* list, queue, set all are inerfaces which extends collection 
interface and all have there own class implimentations*/

public class CollectionInterface {
    public static void main(String[] args) {
        //ArrayList from list (we can say advance array)
        List<String> ar = new ArrayList<>();  // string is data type of the list mean we can only add string data in this list
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for(String o: ar){
            System.out.println(o);
        }
        for(int i = 0; i<ar.size(); i++){
            System.out.println(ar.get(i));
        }

        //HashSet from set (set adds values randomly and it don't store duplicate values)
        System.out.println();
        Set<Integer> s = new HashSet<Integer>();
        s.add(5);
        s.add(6);
        s.add(9);
        s.add(46);
        s.add(60);
        s.add(40);
        s.add(5);
        System.out.println(s);

        // map doesn't extends or implements collection interface but it's a part of collection API/concept
        //Map workes with key, value (map also dont follow the sequence and key can not be repeted)
        System.out.println();
        Map<String,Integer> marks = new HashMap<>();
        marks.put("Ar",25 );
        marks.put("Dc",28 );
        marks.put("Bc",26 );
        marks.put("Dc",30 );
        marks.put("Cc",27 );
        marks.put("ec",2 );


        System.out.println(marks);
        System.out.println(marks.get("B"));

        for(String key : marks.keySet()){
        System.out.println(key +" : "+ marks.get(key));
        }
    }
}

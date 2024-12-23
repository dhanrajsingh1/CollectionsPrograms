package CollectionsPrograms;

import java.util.ArrayList;
import java.util.TreeSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(10);
        al.add(10);
        al.add(20);
        al.add(20);
        al.add(20);
        al.add(30);
        al.add(30);
        al.add(30);
        al.add(30);
        
        System.out.println(al);
        
        TreeSet<Integer> ts = new TreeSet<>(al);
        System.out.println(ts);

    }
}

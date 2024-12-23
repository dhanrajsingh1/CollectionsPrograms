package CollectionsPrograms;

import java.util.ArrayList;

public class ReversingElements {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        for(int i=0, j=al.size()-1; i<al.size()/2; i++,j--){
            int temp = al.get(i);
            al.set(i, al.get(j));
            al.set(j, temp);
        }
        System.out.println(al);
    }
}

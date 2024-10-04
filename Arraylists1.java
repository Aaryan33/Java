import java.util.*;
import java.util.Collections;

public class Arraylists1{

    public static void main(String [] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(6);

        System.out.println(list);

        list.add(1,7);
        list.set(0,2);
        list.remove(2);

        System.out.println(list);

        int a = list.get(1);
        System.out.println(a);

        int s = list.size();
        System.out.println(s);

        Collections.sort(list);
        System.out.println(list);
        
    }
}
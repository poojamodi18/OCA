package StrinngArrayListLambda;

import java.util.ArrayList;

public class ListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(4);
        list.add(12);
        list.add(18);


        System.out.println(list);

        Integer i = new Integer(4);

        list.remove(i);

        System.out.println(list);

        //list.remove(4);   indexOutOfBoundException

        list.remove(i);

        System.out.println(list);


    }
}

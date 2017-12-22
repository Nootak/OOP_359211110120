package ooplap5;

import java.util.ArrayList;

public class myArrayList {
    public static void main(String[] args) {
        //ArrayList
        ArrayList list = new ArrayList();
        String name = "TAK";
        list.add(name);
        System.out.println(list);
        list.add("AI");
        list.add("AOGUS");
        System.out.println(list);
        list.add(2,"BOY");
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add(10.10);
        System.out.println(list);
        list.remove("MAN");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.indexOf("MUK"));
    }//main
}//class

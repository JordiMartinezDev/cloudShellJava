package inheritancePackage;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedList {
    

    public static void run(){


        ArrayList<String> myList = new ArrayList<String>();

        myList.add("First element");
        myList.add("Second element");
        myList.add("Third element");


        myList.remove(1);

        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();

        myLinkedList.add(2);
        myLinkedList.add(2);
        myLinkedList.add(2);

        System.out.println(myList.get(1));
        System.out.println(myList.lastIndexOf("Third element"));

        for(int i = 0; i < myLinkedList.size(); i++ ){
            System.out.println(myLinkedList.get(i));
        }

        for(String eachElement : myList){
            System.out.println(eachElement);
        }
    }

}

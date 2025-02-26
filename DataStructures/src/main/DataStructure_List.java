package main;

import java.util.ArrayList;
import java.util.List;

public class DataStructure_List {
    public static void main(String[] args) {
        //***** DataStructure List ********************************
        List list = new ArrayList<Integer>();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Print the list
        for(var element : list){
            System.out.print(element + " ");
        }
        System.out.println();

        // Access elements from the list
        System.out.println("Second element: " + list.get(1));

        // Remove an element from the list
        list.remove(1);

        // Print the updated list
        System.out.println("After remove element of the index: " + list);

        // Iterate over the list using for-each loop
        System.out.println("List using for-each loop:");
        list.forEach(System.out::println);

        // Iterate over the list using traditional for loop
        System.out.println("List using traditional for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
}

package DataStructure_Lineal;

import java.util.LinkedList;

public class DataStructure_LinkedList {
    public static void main(String[] args) {
        //***** DataStructure LinkedList ********************************
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        // Print the list
        for (var element : linkedList){
            System.out.print(element + " ");
        }
        System.out.println();

        linkedList.forEach(System.out::print);
        System.out.println();

        // Access elements to the list
        System.out.println("Second element: " + linkedList.get(2));

        // Remove an element from the list
        linkedList.remove(1);

        // Print the updated list
        System.out.println("After remove element of the index: " + linkedList);

        // Add an element at a specific position
        linkedList.add(1, 5);

        // Print the updated list
        System.out.println("After add element at index 1: " + linkedList);
    }
}

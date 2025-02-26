package DataStructure_Lineal;

import java.util.ArrayDeque;
import java.util.Queue;

public class DataStructure_Queues {
    public static void main(String[] args) {
        //! DataStructure queue
        Queue queue = new ArrayDeque<Integer>();

        // Add elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Print the queue
        queue.forEach(System.out::println);

        // Remove the front element of the queue
        queue.poll();

        // Print the updated queue
        System.out.println("After poll element: " + queue);

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Get the size of the queue
        System.out.println("Size of the queue: " + queue.size());

        // Remove all elements from the queue
        queue.clear();

        // Print the updated queue
        System.out.println("After clear elements: " + queue);
    }
}

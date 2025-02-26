package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DataStructure_ArrayVSLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Agregar elementos
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Medir tiempo de acceso
        long startTime, endTime;

        // Acceso rápido en ArrayList
        startTime = System.nanoTime();
        int value1 = arrayList.get(50000); // Rápido O(1)
        endTime = System.nanoTime();
        System.out.println("Tiempo ArrayList get(): " + (endTime - startTime) + " ns");

        // Acceso lento en LinkedList
        startTime = System.nanoTime();
        int value2 = linkedList.get(50000); // Lento O(n)
        endTime = System.nanoTime();
        System.out.println("Tiempo LinkedList get(): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        arrayList.add(50000, 999); // Costoso O(n), mueve elementos
        endTime = System.nanoTime();
        System.out.println("Tiempo ArrayList add(): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.add(50000, 999); // Rápido O(1) si ya tienes referencia del nodo
        endTime = System.nanoTime();
        System.out.println("Tiempo LinkedList add(): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        arrayList.remove(50000); // Costoso O(n)
        endTime = System.nanoTime();
        System.out.println("Tiempo ArrayList remove(): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.remove(50000); // Rápido O(1) si ya tienes la referencia
        endTime = System.nanoTime();
        System.out.println("Tiempo LinkedList remove(): " + (endTime - startTime) + " ns");

    }
}

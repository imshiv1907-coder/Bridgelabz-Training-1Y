package com.gla.WrapperClasses.Scenario;
import java.util.*;

public class PerformanceImpact {
        public static void main(String[] args) {

            final int SIZE = 1_000_000;

            long startArray = System.nanoTime();

            int[] primitiveArray = new int[SIZE];
            for (int i = 0; i < SIZE; i++) {
                primitiveArray[i] = i;
            }

            long sumArray = 0;
            for (int i = 0; i < SIZE; i++) {
                sumArray += primitiveArray[i];
            }

            long endArray = System.nanoTime();

            long startList = System.nanoTime();

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < SIZE; i++) {
                list.add(i); // auto-boxing
            }

            long sumList = 0;
            for (Integer num : list) {
                sumList += num; // auto-unboxing
            }

            long endList = System.nanoTime();

            System.out.println("int[] sum: " + sumArray);
            System.out.println("int[] time: " + (endArray - startArray) + " ns");

            System.out.println("ArrayList<Integer> sum: " + sumList);
            System.out.println("ArrayList<Integer> time: " + (endList - startList) + " ns");
        }

}

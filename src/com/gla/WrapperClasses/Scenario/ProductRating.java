package com.gla.WrapperClasses.Scenario;
import java.util.*;
import java.util.stream.*;

public class ProductRating {


        public static void main(String[] args) {
            int[] primitiveRatings = {4, 5, 3, 2};
            ArrayList<Integer> objectRatings = new ArrayList<>();
            objectRatings.add(5);
            objectRatings.add(null);
            objectRatings.add(4);
            objectRatings.add(null);
            objectRatings.add(3);

            List<Integer> combinedList = Arrays.stream(primitiveRatings)
                    .boxed()
                    .collect(Collectors.toList());

            combinedList.addAll(objectRatings);

            double average = combinedList.stream()
                    .filter(Objects::nonNull)
                    .mapToInt(Integer::intValue) // auto-unboxing
                    .average()
                    .orElse(0.0);

            System.out.println("Combined Ratings: " + combinedList);
            System.out.println("Average Rating: " + average);
        }


}

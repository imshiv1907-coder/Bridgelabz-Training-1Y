package com.gla.WrapperClasses.Scenario;

import java.util.*;
import java.util.stream.*;

public class StudentsReport {

        public static void main(String[] args) {
            Object[] inputs = {"85", 95, Integer.valueOf(88), "null", null, "90", "abc"};

            List<Integer> validMarks = new ArrayList<>();

            for (Object obj : inputs) {
                if (obj == null) continue;

                try {
                    if (obj instanceof Integer) {
                        validMarks.add((Integer) obj);
                    } else if (obj instanceof String) {
                        String str = (String) obj;

                        if (str.equalsIgnoreCase("null")) continue;

                        validMarks.add(Integer.parseInt(str));
                    }
                } catch (NumberFormatException e) {
                }
            }

            double average = validMarks.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0.0);


            System.out.println("Valid Marks: " + validMarks);
            System.out.println("Average Marks: " + average);
        }


}

package com.gla.WrapperClasses.Scenario;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeData {
    public static void main(String[] args) {

            int[] ages = {25, 32, 19, 45, 28};

            ArrayList<Integer> ageList = new ArrayList<>();
            for (int age : ages) {
                ageList.add(age); // auto-boxing (int → Integer)
            }

            int youngest = Collections.min(ageList);
            int oldest = Collections.max(ageList);


            System.out.println("Employee Ages: " + ageList);
            System.out.println("Youngest Age: " + youngest);
            System.out.println("Oldest Age: " + oldest);

    }

}

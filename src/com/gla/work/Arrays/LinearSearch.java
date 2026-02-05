package com.gla.work.Arrays;



import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 9, 0};
        int target = 62;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[1] == target) {
                flag = true;
            }
        }

        if (flag == true) {
            System.out.print("Element present");
        } else {
            System.out.print("Element not present");
        }
    }
}
package com.gla.work.Generic;

public class Sum {
        public static <T extends Number> double add(T a, T b) {

            return a.doubleValue() + b.doubleValue() ;
        }

        public static void main (String[] args) {
            System.out.println(add(8, 7)) ;
            System.out.println(add(8.5, 3.5));
        }


}

package com.gla.WrapperClasses.Basic;

public class WrapperToPrimitive {
        public static void main(String[] args) {

            // Creating a Double object
            Double wrapperValue = 45.67;

            // Converting to primitive double (unboxing)
            double doubleValue = wrapperValue;

            // Converting to primitive int (using casting)
            int intValue = (int) doubleValue;

            // Printing all values
            System.out.println("Wrapper Double value: " + wrapperValue);
            System.out.println("Primitive double value: " + doubleValue);
            System.out.println("Primitive int value (after casting): " + intValue);
        }


}

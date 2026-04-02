package com.gla.WrapperClasses.Basic;
import java.util.ArrayList;

public class WrapperObj {

    public static void main(String[] args) {

            double[] prices = {10.5, 20.0, 35.75, 5.5};
            ArrayList<Double> priceList = new ArrayList<>();
            for (double price : prices) {
                priceList.add(price);
            }

            double max = priceList.get(0);
            double sum = 0;

            for (Double price : priceList) {
                if (price > max) {
                    max = price;
                }
                sum += price;
            }

            double average = sum / priceList.size();

            System.out.println("Prices: " + priceList);
            System.out.println("Highest price: " + max);
            System.out.println("Average price: " + average);
    }
}

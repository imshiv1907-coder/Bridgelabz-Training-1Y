import java.util.*;

class SumNumbers {
    static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Double> list2 = Arrays.asList(1.5, 2.5);

        System.out.println(sumNumbers(list1));
        System.out.println(sumNumbers(list2));
    }
}
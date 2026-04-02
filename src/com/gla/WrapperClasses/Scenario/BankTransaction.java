package com.gla.WrapperClasses.Scenario;

public class BankTransaction {

        public static double getRemainingLimit(Double dailyLimit, double withdrawnAmount) {
            if (dailyLimit == null) {
                return 0.0;
            }
            double remaining = dailyLimit - withdrawnAmount;
            return remaining >= 0 ? remaining : 0.0;
        }

        public static void main(String[] args) {

            Double limit1 = 5000.0;
            Double limit2 = null;
            double withdrawn = 1200.0;
            System.out.println("Remaining Limit (limit1) = " + getRemainingLimit(limit1, withdrawn));
            System.out.println("Remaining Limit (limit2) = " + getRemainingLimit(limit2, withdrawn));
        }


}

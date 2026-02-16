package com.gla.Methods.Level3;
import java.util.Arrays;

public class OTPGenerator {

        public static int generateOTP() {
            // Math.random() generates value [0.0, 1.0), scale to 100000-999999
            return 100000 + (int)(Math.random() * 900000);
        }

        // b. Generate array of 10 OTPs
        public static int[] generateMultipleOTPs(int count) {
            int[] otps = new int[count];
            for (int i = 0; i < count; i++) {
                otps[i] = generateOTP();
            }
            return otps;
        }

        // c. Check if all OTPs are unique
        public static boolean areOTPsUnique(int[] otps) {
            for (int i = 0; i < otps.length; i++) {
                for (int j = i + 1; j < otps.length; j++) {
                    if (otps[i] == otps[j]) return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            int numberOfOTPs = 10;
            int[] otps = generateMultipleOTPs(numberOfOTPs);

            System.out.println("Generated OTPs: " + Arrays.toString(otps));

            if (areOTPsUnique(otps)) {
                System.out.println("All OTPs are unique!");
            } else {
                System.out.println("Some OTPs are repeated. Regenerate!");
            }
        }

}

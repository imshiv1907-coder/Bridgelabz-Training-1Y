package com.gla.Methods.Level3;
import java.util.Scanner;
public class CalendarDisplay {

        public static String getMonthName(int month) {
            String[] months = { "January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December" };
            if (month < 1 || month > 12) return "Invalid";
            return months[month - 1];
        }

        // b. Check if leap year
        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

        // b. Get number of days in a month
        public static int getNumberOfDays(int month, int year) {
            int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            if (month == 2 && isLeapYear(year)) return 29;
            return daysInMonth[month - 1];
        }

        // c. Get first day of the month (0=Sunday, 1=Monday, ..., 6=Saturday)
        public static int getFirstDayOfMonth(int month, int year) {
            // Zeller's Congruence algorithm
            int q = 1; // day of month
            int m = month;
            int y = year;
            if (m == 1 || m == 2) { // Jan and Feb are counted as months 13 and 14 of previous year
                m += 12;
                y -= 1;
            }
            int K = y % 100;
            int J = y / 100;
            int h = (q + (13*(m + 1))/5 + K + (K/4) + (J/4) + 5*J) % 7;
            int dayOfWeek = ((h + 6) % 7); // Convert to 0=Sunday, 1=Monday, ...
            return dayOfWeek;
        }

        // d. Display the calendar
        public static void displayCalendar(int month, int year) {
            String monthName = getMonthName(month);
            int daysInMonth = getNumberOfDays(month, year);
            int firstDay = getFirstDayOfMonth(month, year);

            System.out.println("\n     " + monthName + " " + year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            // First loop: indent spaces for first day
            for (int i = 0; i < firstDay; i++) {
                System.out.print("    "); // 4 spaces for alignment
            }

            // Second loop: print days
            for (int day = 1; day <= daysInMonth; day++) {
                System.out.printf("%3d ", day);
                if ((firstDay + day) % 7 == 0) System.out.println(); // new line after Saturday
            }
            System.out.println(); // final newline
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter month (1-12): ");
            int month = scanner.nextInt();
            System.out.print("Enter year: ");
            int year = scanner.nextInt();

            displayCalendar(month, year);

            scanner.close();
        }

}

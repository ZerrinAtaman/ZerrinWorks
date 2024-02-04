package day06_practice_tasks;

public class SalaryCalculator {

        public static void main(String[] args) {

            double rate = 45;
            int hours = 40;

            double income = salary(rate, hours);
            System.out.println(income);
        }

        public static double salary(double rate, int hours) {
            return hours * rate * 52;
        }
    }


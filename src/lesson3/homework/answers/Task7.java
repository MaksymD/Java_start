package lesson3.homework.answers;


    public class Task7 {
        public static void main(String[] args) {
            //your code
            System.out.println(convertEurToUsd(20, 1.12));
            System.out.println(convertEurToUsd(50, 1.12));

        }

        public static double convertEurToUsd(int eur, double exchangeRate) {
            //your code
            return eur * exchangeRate;
        }
    }


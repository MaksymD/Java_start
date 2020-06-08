package lesson2.homework;

/*
Comment two lines so that the program displays the numbers 12 and 2 (first 12, then 2).

Закоментируйте две строки, чтобы программа отображала числа 12 и 2 (сначала 12, затем 2).
*/

public class Task1 {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

       // y = x * y;
        y = x + y;

        x = y - x; //
        // y = y + x;
        y = y - x;//

        System.out.println(x);
        System.out.println(y);
    }
}

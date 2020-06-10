package lesson3.homework;

/*
Write a function that calculates a minimum of four numbers.
The min (a, b, c, d) function must also call the min (a, b) function

Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать функцию min(a,b)
*/

public class Task6 {
    public static int min(int a, int b, int c, int d) {
        //your code here
        return 0;
    }

    public static int min(int a, int b) {
        //your code here
        return 0;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}

package lesson2.homework;

/*
*Comment out the maximum number of lines so that the number 19 is displayed
*
* Закомментируй максимальное количество строк, чтобы на экран вывелось число 19
*/
public class Task14 {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        y = y + 3 * x;
        x = x * 2;
        x = x * 16;
        y = y + 2 * x;
        y = y + x;

        System.out.println(y);

    }
}

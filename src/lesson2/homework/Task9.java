package lesson2.homework;

/*
In the main method, place the plus and minus signs correctly so that the value of the result variable turns out to be 20.
Characters need to be placed only in the line in which the variable result is declared.
The order of the variables in this line cannot be changed.
Each variable must be preceded by a plus or minus sign.

В методе main расставь правильно знаки плюс и минус, чтобы значение переменной result получилось равным 20.
Знаки нужно расставить только в строчке, в которой объявляется переменная result.
Порядок следования переменных в этой строке изменять нельзя.
Перед каждой переменной должен стоять знак либо плюс, либо минус.
*/
public class Task9 {

    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    public static void main(String[] args) {

        int result = d + b - c - a ;

        System.out.println(result);

    }
}

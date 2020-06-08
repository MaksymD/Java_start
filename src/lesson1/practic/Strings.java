package lesson1.practic;

public class Strings {

    public static void main(String[] args) {

        String text1 = "This TV is very loud";
        System.out.println(text1);

        String text2 = "This TV";
        text2 = text2 + " is very loud";
        System.out.println(text2);

        String text3 = "This TV" + " " + "is very loud";
        System.out.println(text3);

        System.out.println("This TV is very loud");

        String one = "This";
        String two = "TV";
        String three = "is";
        String four = "very";
        String five = "loud";
        String space = " ";
        System.out.println(one + space + two + space + three + space + four + space + five);


    }
}

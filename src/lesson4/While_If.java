package lesson4;

public class While_If {
    public static void main(String[] args) {


        int x = 1;
        int y = 1;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }
        System.out.println("End of While loop");

        if (y <= 10) {
            System.out.println(y);
            y++;
        }
        System.out.println("End of If statement");
    }
}
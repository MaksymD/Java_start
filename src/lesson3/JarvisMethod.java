package lesson3;

public class JarvisMethod {

    public void sayHi(String name) {
        System.out.println("Добрый вечер, " + name + ", как ваши дела?");
    }
/*
    public void sayHi(String firstGuest, String secondGuest) {
        System.out.println("Добрый вечер, " + firstGuest + ", " + secondGuest + ", как ваши дела?");
    }
    public void sayHi(String...names) {
        for (String name: names) {
            System.out.println("Добрый вечер, " + name + ", как ваши дела?");
        }
    }
*/

    public static void main(String[] args) {
        JarvisMethod jarvis = new JarvisMethod();
        jarvis.sayHi("Тони Старк");
/*        jarvis.sayHi("Тони Старк", "Капитан Америка");*/
    }
}
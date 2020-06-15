package lesson3;

public class CatMethod {

    String name;
    int age;

    public void sayMeow() {
        System.out.println("Мяу!");
    }

    public void jump() {
        System.out.println("Прыг-скок!");
    }

    public static void main(String[] args) {
        CatMethod barsik = new CatMethod();
        barsik.age = 3;
        barsik.name = "Барсик";
        System.out.println("Cat name: " + barsik.name + " Cat age: " + barsik.age);
        System.out.println("This cat can do: ");

        barsik.sayMeow();
        barsik.jump();

    }

}

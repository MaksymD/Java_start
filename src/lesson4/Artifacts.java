package lesson4;

public class Artifacts {

    int age;
    String culture;
    //int indNumber = 0;
    static int indNumber = 0;

    public Artifacts(){
        indNumber++;

    }

    public Artifacts(String culture){
        indNumber++;
        this.culture = culture;

    }

    public Artifacts(String culture, int age){
        indNumber++;
        this.culture = culture;
        this.age = age;

    }

    public static void main(String[] args) {

        Artifacts sword = new Artifacts();
        Artifacts knife = new Artifacts("Aztecs");
        Artifacts pistol = new Artifacts("India", 18);

        System.out.println(" ");
        System.out.println(sword.toString());
        System.out.println(knife.culture);
        System.out.println(pistol.culture + " " + pistol.age);

        System.out.println("Sum of Artifacts: " + indNumber);
    }
}

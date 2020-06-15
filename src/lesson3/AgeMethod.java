package lesson3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AgeMethod {

    public static void sayYourAge(String greeting, int age) {

        System.out.println(greeting + " " + age);
    }

    public static void main(String[] args) {

        Scanner age = new Scanner(System.in);
        System.out.println("Tell me your age: ");
        int i = age.nextInt();

        sayYourAge("My age - ", 22);
        //sayYourAge(22, "My age - ");
    }
}


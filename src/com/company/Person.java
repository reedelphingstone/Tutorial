import java.io.*;
import java.util.*;

public class Person {
    private int age;

    public Person(int initialAge) {
        if ( initialAge < 0){
            age = 0;
        }
        else{
            age = initialAge;
        }
    }

    public void amIOld() {
        if (age >= 0 && age < 13){
            System.out.println("You are young.");
        }
        else if (age >= 13 && age < 18){
            System.out.println("You are a teenager.");
        }
        else{
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        age++;
    }

    public static void main(String[] args) {
        Person p1 = new Person(17);
        p1.amIOld();
        for (int i = 1; i<=3; i++){
            p1.yearPasses();
        }
        p1.amIOld();
    }

    }

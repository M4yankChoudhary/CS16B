package classes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog(9);
        Dog d2 = new Dog(15);
        Dog bigger = Dog.maxDog(d1, d2);
        bigger.makeNoise();
        System.out.println(Dog.name);
    }
}

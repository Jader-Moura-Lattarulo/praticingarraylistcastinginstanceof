package br.com.alura.exercise3;

import br.com.alura.exercise2.Animal;
import br.com.alura.exercise2.Dog;

public class AnimalTest03 {
    public static void main(String[] args) {
        var dog01 = new Dog("Caramelo", "Doug", 8);
        System.out.println(dog01);

        if (dog01 instanceof Dog) {
            System.out.println((Animal) dog01 + " recebeu " + dog01);
        } else {
            System.out.println("Já é classe Animal");
        }

    }
}

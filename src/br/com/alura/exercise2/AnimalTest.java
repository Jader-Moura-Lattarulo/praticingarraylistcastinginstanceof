package br.com.alura.exercise2;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog01 = new Dog("Caramelo", "Doug", 8);
        System.out.println(dog01);

        dog01.makeSound();

        ((Animal) dog01).makeSound();

        dog01.fetchTwig();

    }
}

package br.com.alura.exercise3;

import br.com.alura.exercise2.Animal;

public class Dog03 extends Animal {
    public Dog03(String race, String name, int age) {
        super(race, name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Au-au!");
    }

    public void fetchTwig() {
        System.out.println(getName() + " buscou o graveto");
    }

}

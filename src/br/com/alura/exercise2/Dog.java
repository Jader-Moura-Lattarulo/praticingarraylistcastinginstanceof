package br.com.alura.exercise2;

public class Dog extends Animal{
    public Dog(String race, String name, int age) {
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

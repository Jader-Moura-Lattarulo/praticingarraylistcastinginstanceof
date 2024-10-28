package br.com.alura.exercise3;

public class Animal03 {
    private final String race;
    private final String name;
    private int age;

    public Animal03(String race, String name, int age) {
        this.race = race;
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void makeSound(){
        System.out.println("O animal faz um som.");
    }
}

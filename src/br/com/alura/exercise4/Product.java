package br.com.alura.exercise4;

public class Product {
    private final String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s\nPreço: R$ %.2f", name, price);
    }
}

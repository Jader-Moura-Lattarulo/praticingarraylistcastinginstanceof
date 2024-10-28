package br.com.alura.exercise4;

import java.util.ArrayList;

public class ProductMain {
    public static void main(String[] args) {
        Product product01 = new Product("Bola", 65);
        Product product02 = new Product("Chuteira", 125);
        Product product03 = new Product("Caneta", 1.50);
        Product product04 = new Product("Notebook", 3850);
        Product product05 = new Product("Moletom", 164.99);
        Product product06 = new Product("Pelicula", 25);

        ArrayList<Product> products = new ArrayList<>();

        products.add(product01);
        products.add(product02);
        products.add(product03);
        products.add(product04);
        products.add(product05);
        products.add(product06);

        double priceSum = 0;
        int cont = 0;

        for (Product item : products) {
            System.out.println(item);
            cont++;
            priceSum += item.getPrice();

            System.out.println(cont);
            System.out.println(priceSum);
            System.out.println();
        }

        System.out.println(priceSum/cont);
    }
}

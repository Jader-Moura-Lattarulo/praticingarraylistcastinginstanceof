package br.com.alura.exercise5;

public class Rectangle implements Form{
    private final double base;
    private final double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String calculateArea() {
        double area = base * height;
        return String.format("Um retângulo com base: %.2fcm e altura: %.2fcm possui uma área de: %.2fcm", base, height, area);
    }

    @Override
    public String toString() {
        return calculateArea();
    }
}

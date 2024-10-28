package br.com.alura.exercise5;

public class Triangle implements Form{
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String calculateArea() {
        double area = (base * height) / 2;
        return String.format("Um triângulo com base: %.2fcm e altura: %.2fcm tem uma área de: %.2fcm", base, height, area);
    }

    @Override
    public String toString() {
        return calculateArea();
    }
}

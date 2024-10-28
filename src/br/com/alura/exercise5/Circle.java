package br.com.alura.exercise5;

public class Circle implements Form{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String calculateArea() {
        double area = Math.PI * Math.pow(radius,2);
        return String.format("Um circulo de raio: %.2fcm tem área de: %.2fcm", radius, area);
    }

    @Override
    public String toString() {
        return calculateArea();
    }
}

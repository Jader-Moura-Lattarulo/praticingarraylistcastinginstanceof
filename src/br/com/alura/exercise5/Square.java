package br.com.alura.exercise5;

public class Square implements Form{
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String calculateArea() {
        double area = Math.pow(side, 2);
        return String.format("Um quadrado com lados de: %.2fcm tem uma área de: %.2fcm",side, area);
    }

    @Override
    public String toString() {
        return calculateArea();
    }
}

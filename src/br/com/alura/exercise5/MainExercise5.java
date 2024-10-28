package br.com.alura.exercise5;

import java.util.ArrayList;

public class MainExercise5 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(2);
        Triangle triangle = new Triangle(4, 8);
        Rectangle rectangle = new Rectangle(6, 15);

        ArrayList<Form> formArrayList = new ArrayList<>();
        formArrayList.add(circle);
        formArrayList.add(square);
        formArrayList.add(triangle);
        formArrayList.add(rectangle);

        for (Form form : formArrayList){
            System.out.println(form);
        }
    }
}

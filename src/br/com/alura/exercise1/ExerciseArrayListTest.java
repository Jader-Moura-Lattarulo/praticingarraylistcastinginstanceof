package br.com.alura.exercise1;


import java.util.ArrayList;

public class ExerciseArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("Bacon");
        stringArrayList.add("Salada");
        stringArrayList.add("Pão");
        stringArrayList.add("Bla bla bla");
        stringArrayList.add("Batman");

        for (String item : stringArrayList) System.out.println(item);

    }
}

package br.com.alura.exercise6;

import java.util.Random;

public class RandomBalance {

    public double randomDouble(){
        Random random = new Random();
        double randomDouble = 1 + (5000) * random.nextDouble();
        return Math.round(randomDouble * 100.0) / 100.0;
    }

}

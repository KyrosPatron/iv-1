package com.itsvil;

import java.util.Random;
import java.util.stream.IntStream;

public class Starter {
    public static void main(String[] args) {
        var randomSort = new RandomSort();
        final var NUMBER_OF_CYCLES = 100;
        final var ARRAY_SIZE = 10;

        int[] array = IntStream.generate(() -> new Random().nextInt(NUMBER_OF_CYCLES)).limit(ARRAY_SIZE).toArray();

        //Stampa dell'array
        for (int  a : array) {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("------------------------");
        int counter = randomSort.sort(array);
        //Stampa dell'array dopo l'ordinamento
        for (int  a : array) {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("-> Array shuffled for "+counter+" times");



    }
}
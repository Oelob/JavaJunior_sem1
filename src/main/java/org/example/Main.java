package org.example;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println(IntStream.of(10, 2, 3, 4, 6,4,3,45,22, 3, 4, 2, 1, 5).filter(x -> x % 2 == 0).average());

    }
}
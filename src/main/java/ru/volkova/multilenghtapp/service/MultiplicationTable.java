package ru.volkova.multilenghtapp.service;

public class MultiplicationTable {
    public void multiplication() {
        int x;
        int y;
        for (x = 2; x < 6; x++) {
            for (y = 1; y < 11; y++) {
                int num = x * y;
                System.out.println(x + " * " + y + " = " + num);
            }
        }
    }
}
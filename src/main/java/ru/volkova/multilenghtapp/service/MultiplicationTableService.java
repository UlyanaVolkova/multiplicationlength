package ru.volkova.multilenghtapp.service;

public class MultiplicationTableService {
    public void printMultiplyTable() {
        int y;
        int x;
        for (x = 2; x < 6; x++) {
            for (y = 1; y < 11; y++) {
                int num = x * y;
                System.out.println(x + " * " + y + " = " + num);
            }
        }
    }
}
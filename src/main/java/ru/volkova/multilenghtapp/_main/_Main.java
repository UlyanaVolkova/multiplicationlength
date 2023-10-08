package ru.volkova.multilenghtapp._main;

import ru.volkova.multilenghtapp.service.MultiplicationTable;
import ru.volkova.multilenghtapp.service.SegmentLength;

import java.util.Scanner;

public class _Main {

    public static void main(String[] args) {

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.multiplication();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметры первой точки: x1 y1");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Введите параметры второй точки: x2 y2");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        SegmentLength segmentLength = new SegmentLength();
        double result = segmentLength.segmentLength(x1, y1, x2, y2);

        System.out.println("Длина отрезка = " + result);
    }
}

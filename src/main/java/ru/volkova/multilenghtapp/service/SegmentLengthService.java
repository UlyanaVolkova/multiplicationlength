package ru.volkova.multilenghtapp.service;

import java.util.Scanner;

public class SegmentLengthService {
    public static double calculateSegmentLen(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        return distance;
    }

    public void printSegmentLen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметры первой точки: x1 y1");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Введите параметры второй точки: x2 y2");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double result = SegmentLengthService.calculateSegmentLen(x1, y1, x2, y2);
        System.out.println("Длина отрезка = " + result);
    }
}


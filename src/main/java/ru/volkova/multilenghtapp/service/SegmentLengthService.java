package ru.volkova.multilenghtapp.service;

public class SegmentLengthService {

    public double calculateSegmentLen(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        return distance;
    }
}


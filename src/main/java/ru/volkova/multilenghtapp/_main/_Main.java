package ru.volkova.multilenghtapp._main;

import ru.volkova.multilenghtapp.service.MultiplicationTableService;
import ru.volkova.multilenghtapp.service.SegmentLengthService;

public class _Main {
    public static void main(String[] args) {
        MultiplicationTableService multiplicationTable = new MultiplicationTableService();
        SegmentLengthService segmentLength = new SegmentLengthService();
        multiplicationTable.printMultiplyTable();
        segmentLength.printSegmentLen();
    }
}

package com.company;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(new int[200]);
        array.initArray();
        array.addToArrayEvenNumbers();
        array.fillArrayWithRandomNumbers();
        array.averageValue();
        array.sumValuesMultiples3();
        array.valuesOfPairedIndexes();
        array.sortArray();
        array.smallestValue();
        array.largestValue();
        array.sumOfAllPairedIndices();
        array.first20CharactersASCI();
    }
}
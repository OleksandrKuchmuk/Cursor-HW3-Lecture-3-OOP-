package com.company;

import java.util.Random;

public class Array {

    int largestValue = 0;
    int smallestValue = 500;
    int sumOfAllPairedIndices = 0;
    double count = 0;
    int countDivision3 = 0;
    int[] array;

    public Array(int[] array1) {
        this.array = array1;
    }

    //      Ініціалізація масиву
    public void initArray() {
        System.out.println("Test print Initialised array:");
        for (int i = 0; i < array.length; ++i) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
    }

    //      1. Заповнити масив тільки парними числами
    public void addToArrayEvenNumbers() {
        System.out.println("\n\nThe array is filled with even numbers:");
        for (int i = 0, a = 0; i < array.length; i++) {
            array[i] = (a += 2);
            System.out.print(array[i] + " ");
        }
    }

    //      2. Заповнити масив рандомними числами
    public void fillArrayWithRandomNumbers() {
        System.out.println("\n\nThe array is filled with random numbers:");
        for (int i = 0; i < array.length; i++) {
            Random randomNumbers = new Random();
            array[i] = randomNumbers.nextInt(500);
            System.out.print(array[i] + " ");
        }
    }

    //      3. Вивести середнє значення масиву
    public void averageValue() {
        for (int i : array) {
            count += i;
        }
        System.out.println("\nThe average value of the array: " + count / array.length);
    }

    //      4. Вивести суму всіх значень кратних 3
    public void sumValuesMultiples3() {
        for (int i : array) {
            if (i % 3 == 0) {
                countDivision3 += i;   //сума всіх значень кратних 3
            }
        }
        System.out.println("\nThe sum of all values multiples of 3: " + countDivision3 + "\n");
    }

    //      5. Вивести значення всіх парних індексів масиву
    public void valuesOfPairedIndexes() {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println("The value of the " + i + " array element:   " + array[i]);
            }
        }
    }

    //      6. Просортувати масив в порядку зростання
    //      Insertion sort
    public void sortArray() {
        for (int i = 1; i < array.length; ++i) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
    }

    //      7. Вивести найменше значення в масиві
    public void smallestValue() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= smallestValue) {
                smallestValue = array[i];
            }
        }
        System.out.println("\nThe smallest value of the array:  " + smallestValue);
    }

    //      8. Вивести найбільше значення масиву
    public void largestValue() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= largestValue) {
                largestValue = array[i];       //найбільше значення масиву
            }
        }
        System.out.println("\nThe largest value of the array:   " + largestValue);
    }

    //      9. Вивести суму значень всіх парних індексів
    public void sumOfAllPairedIndices() {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumOfAllPairedIndices += array[i];   //сума значень всіх парних індексів
            }
        }
        System.out.println("\nThe sum of all paired indices:   " + sumOfAllPairedIndices);
    }

    //      10. Вивести перших 20 символів з таблиці ASCI
    public void first20CharactersASCI() {
        System.out.println("\nThe first 20 characters of the ASCI table:");
        for (char i = 32; i < 52; i++) {
            System.out.print(i + " ");
        }
    }
}
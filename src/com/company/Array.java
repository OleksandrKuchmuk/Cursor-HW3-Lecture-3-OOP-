package com.company;

import java.util.Random;

public class Array {

    public int length;
    int[] array;             //3 тепер ми зможемо достукатись до нашого масиву з будь-якої точки нашого класу

    public Array(int[] array1) {   //1 приймаємо значення array1 з мейн
        this.array = array1;       //2 присвоюємо отримане значення array1 нашому масиву array

    }

//    public void initArray(){
//
//        System.out.println("Test print Initialised array:");
//        for (int i = 0; i < array.length; ++i) {
//            array[i] = i;
//            System.out.print(array[i]+" ");
//        }
//        System.out.println();
//    }

    public void addToArrayEvenNumbers() {
        System.out.println("The array is filled with even numbers:");
        for (int i = 0, a = 0; i < array.length; i++) {
            array[i] = (a += 2);
            System.out.print(array[i]+" ");
        }
    }

    public void fillArrayWithRandomNumbers(){
        for (int i = 0; i < array.length; i++) {
            Random randomNumbers = new Random();
            array[i] = randomNumbers.nextInt(500);
        }



    }


//        public void printArray(){
//            System.out.println("Test print Array:");
//            for (int i = 0, a = 0; i < array.length; i++) {
//                System.out.print(i+ " ");
//            }
//            System.out.println();
//        }


    }



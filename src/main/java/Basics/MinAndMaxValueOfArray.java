package Basics;

import java.util.Random;


public class MinAndMaxValueOfArray {



    public static int getMin(int[] array) {
        int min = array[0];
        for (int resultMin : array
                ) {
            if (min > resultMin) min = resultMin;

        }return min;
    }

    public static int getMax(int []array){
        int max = array[0];
        for (int resultMax: array
             ) {
            if (max<resultMax)max = resultMax;
        }return max;
    }


    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((10));
            System.out.print(array[i] + ", ");

        }
        System.out.println();
        System.out.println("Wartosc min to: "+ getMin(array));
        System.out.println("Wartosc max to: "+ getMax(array));



    }
}

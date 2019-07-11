package Basics;

import java.util.Random;


public class CounterElementOfArray {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[20];
        int x = random.nextInt(10);
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + ", ");
            if (array[i] == x) {
                counter++;
            }
        }
        System.out.println();
        System.out.println("Liczba wystapien liczby " + x + " wynosi " + counter + " razy.");



    }
}

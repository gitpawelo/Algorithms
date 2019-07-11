package Basics;

import java.util.Random;


public class FindingElementInArray {


    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];
        int x = random.nextInt(10);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + ", ");
            if (array[i] ==x){
                System.out.println();
                System.out.println("Podana liczba " + x + " wystapila w tablicy.");
                break;
            }
        }
          }
}


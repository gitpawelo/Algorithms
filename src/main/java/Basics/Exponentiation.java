package Basics;

import java.util.Scanner;


public class Exponentiation {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.print("Podaj liczbe calkowita a : ");
        int a = skaner.nextInt();
        System.out.print("Podaj liczbe calkowita b : ");
        int b = skaner.nextInt();
        int result = 1;

        while (b>0) {
            result = result*a;
            b=b-1;
        }
        System.out.println(result);

    }
}

package ArithmeticsAlgorithms;

import java.util.Scanner;

public class Euklides {

    public static int doEuklides(int a, int b) {

        while (a!=b)
        if (a<b){
             b-=a;
        }
        else {
             a-=b;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj liczbe a: ");
        int a = skaner.nextInt();
        System.out.println("Podaj liczbe b: ");
        int b = skaner.nextInt();

        System.out.println(doEuklides(a,b));
    }

}

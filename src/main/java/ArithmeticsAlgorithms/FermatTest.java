package ArithmeticsAlgorithms;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by HP on 2017-09-06.
 */
public class FermatTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Podaj dokładość k: ");
        double k = input.nextDouble();
        System.out.println("Podaj sprawdzaną liczbę p: ");
        int p = input.nextInt();
        int a;
        int i = 0;


        while (!(i >= k)) {

            a = random.nextInt((p - 1) + 1);
            System.out.println("Wylosowana liczba a: " + a);
            double temp = Math.pow(a, (p - 1));
            boolean temp2 = true;
            if (temp2 == (temp % p == 1)) {
                System.out.println("Liczba " + p + " jest prawdopodobnie liczba pierwsza");

            } else {
                System.out.println("Liczba " + p + " nie jest liczba pierwsza.");
            }
            i++;
        }
    }
}

package Zadania;

import java.util.Scanner;

public class Zadanie6 {

    Scanner scanner = new Scanner(System.in);

    public void zad6() {

        int[] tab = new int[5];

        System.out.println("Podaj 5 liczb");
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj liczne " + (i + 1) + " ");
            tab[i] = scanner.nextInt();
        }
        System.out.println("\n Silnie z podanych liczb: ");
        for (int i = 0; i < 5; i++) {
            long silnia = 1;
            for (int j = 2; j <= tab[i]; j++) {
                silnia *= j;
            }

            System.out.println(tab[i] + "! = " + silnia);
        }
    }
}

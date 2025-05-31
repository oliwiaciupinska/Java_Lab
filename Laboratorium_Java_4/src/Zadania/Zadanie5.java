package Zadania;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Zadanie5 {

    Scanner scanner = new Scanner(System.in);

    public void zad5(){

        int [] tab = new int[8];

        System.out.println("Podaj osiem liczb");

        for(int i = 0; i < 8 ; ++i ) {
            System.out.println("Podaj liczbe " + (i + 1) + " ");
            tab[i] = scanner.nextInt();
        }

        Arrays.sort(tab);
        System.out.println("\n Posortowane liczby " + Arrays.toString(tab));
    }
}

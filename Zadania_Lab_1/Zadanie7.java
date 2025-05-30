package Zadania_Lab_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie7 {

    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();


    public void zad7(){

        System.out.println("Podaj pierwsza liczbe");
        int a = scanner.nextInt();

        System.out.println("Podaj druga liczbe");
        int b = scanner.nextInt();

        int c = rand.nextInt(b - a + 1) + a;
        int d =rand.nextInt(b - a + 1) + a;
        int e =rand.nextInt(b - a + 1) + a;

        System.out.println("Wylosowane boki: " + c + ", " + d + ", " + e);

        int [] dlugosci = {c,d,e};
        Arrays.sort(dlugosci);

        boolean wynik = dlugosci[0]*dlugosci[0] + dlugosci[1]*dlugosci[1]== dlugosci[2]*dlugosci[2];

        System.out.println("Czy mozna zbudować trójkąt prostokątny " + wynik);
    }
}

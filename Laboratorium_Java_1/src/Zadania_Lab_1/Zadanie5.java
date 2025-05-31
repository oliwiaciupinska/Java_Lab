package Zadania_Lab_1;

import java.util.Scanner;

public class Zadanie5 {

    Scanner scanner = new Scanner(System.in);

    public void zad5(){

        System.out.println("Podaj liczbe");
        int a = scanner.nextInt();

        System.out.println("Podana liczba podniesiona do 3 potegi to " + (a*a*a));
    }
}

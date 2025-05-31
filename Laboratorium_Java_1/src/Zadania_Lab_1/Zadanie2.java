package Zadania_Lab_1;

import java.util.Scanner;

public class Zadanie2 {

    Scanner scanner = new Scanner(System.in);
    public void zad2(){


        System.out.println("Podaj a");
        int a = scanner.nextInt();

        System.out.println("Podaj b");
        int b = scanner.nextInt();

        System.out.println("Suma "  + (a+b));
        System.out.println("Różnica " + (a-b));
        System.out.println("Iloczyn " + (a*b));
    }
}

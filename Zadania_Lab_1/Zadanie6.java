package Zadania_Lab_1;

import java.util.Scanner;

public class Zadanie6 {

    Scanner scanner = new Scanner(System.in);

    public void zad6(){

        System.out.println("Podaj liczbe");
        int a = scanner.nextInt();

        double pierwiastek = Math.sqrt(a);
        System.out.println("Pierwiastek kwadratowy z podanje liczby to" + pierwiastek);
    }
}

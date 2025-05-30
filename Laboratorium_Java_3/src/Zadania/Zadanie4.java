package Zadania;

import java.util.Random;
import java.util.Scanner;

public class Zadanie4 {

    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    public void zad4(){

        int suma = 0;
        int i = 0;

        System.out.println("Wpisz ile liczb chcesz wylosowac");
        int n = scanner.nextInt();

        int liczba = rand.nextInt(56)-10;

        while ( i<n){
            System.out.println("Liczba która wylosowałeś to: " + liczba);

            if(liczba % 2 == 0){
                suma += liczba;
            }
            ++i;
        }
        System.out.println("\n Wszystkich liczb parzystych jest " + suma);
    }

}

package Zadania;

import java.util.Scanner;

public class Zadanie4 {

    Scanner scanner = new Scanner(System.in);

    public void zad4(){

        String[] tablica = new String[5];

        System.out.println("Podaj pięć wyrazów: ");

        for(int i = 0 ; i < 5; ++i){
            System.out.println("Podaj słowo " + (i + 1 ) + " " );
            tablica[i] = scanner.nextLine();
        }

        System.out.println("\n Te wyrazy od tyłu to: ");
        for(int i =4; i>=0 ; i--){
            StringBuilder tyl = new StringBuilder(tablica[i]);
            System.out.println(tyl.reverse().toString());
        }
    }
}

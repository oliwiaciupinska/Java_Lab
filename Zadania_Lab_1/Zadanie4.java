package Zadania_Lab_1;

import java.util.Scanner;

public class Zadanie4 {

    Scanner scanner = new Scanner(System.in);
    public void zad4(){

        System.out.println("Podaj liczbe");
        int a = scanner.nextInt();

        if(a % 3 == 0 && a % 5 == 0){
            System.out.println("Podana liczba jest podzienlna przez 3 i 5");
        } else if (a % 5 != 0) {
            System.out.println("Podana liczba nie jest podzielna przez 5");
        }else{
            System.out.println("Podana liczba nie jest podzielan przez 3");
        }
    }
}

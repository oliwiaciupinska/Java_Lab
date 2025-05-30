package Zadania;

import java.util.Scanner;

public class Zadanie1 {

    Scanner scanner = new Scanner(System.in);

    public void zad1(){
        int i = 0;
        double srednia = 0;

        System.out.println("Wprowadź liczbe studentów");
        int n = scanner.nextInt();

        while (i < n){
            System.out.println("Podaj punkty kazdego studenta: ");
            double punkty = scanner.nextDouble();;
            srednia += punkty;
            ++i;
        }

        double suma = srednia/n;
        System.out.println("Średnia punktów wszystki studentów to: " + suma);
    }

}

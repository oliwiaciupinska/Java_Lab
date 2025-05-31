package Zadania;

public class Zadanie1 {

    public void zad1() {

        int suma = 0;
        double srednia;
        int[] LiczbyCalkowite = {12, 4, 45, 32, 24};

        // Pętla for tutaj sumujemy
        for (int i = 0; i < LiczbyCalkowite.length; i++) {
            suma += LiczbyCalkowite[i];
        }
        System.out.println("Suma liczb z tablicy jest równa " + suma);


        // Pętla for each tutaj liczymy średnia
        for (int liczba : LiczbyCalkowite) {
            suma += liczba;
        }

        srednia =(double) suma / LiczbyCalkowite.length;

        System.out.println("Średnia liczb tablicy jest równa " + srednia);
    }
}
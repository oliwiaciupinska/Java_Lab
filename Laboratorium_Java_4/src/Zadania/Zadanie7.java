package Zadania;

import java.util.Arrays;

public class Zadanie7 {

    public void zad7(){

        String [] pierwsza = {"Ala", "Kot" , "Piers"  , "Koń"};
        String [] druga = {"Ala", "Kot" , "Piers"  , "Koń"};

        System.out.println("Pierwsza tablica" + Arrays.toString(pierwsza));

        System.out.println("Druga tablica " + Arrays.toString(druga));

        if(Arrays.equals(pierwsza,druga)){
            System.out.println("Tablice są identyczne");
        }else{
            System.out.println("Tablice nie są identyczne");
        }
    }
}

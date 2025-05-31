package Zadanie1;

public class Main {
    public static void main(String[] args){

        Osoba osoba1 = new Osoba("Oliwia" , "Ciupińska" , 21);
        osoba1.pokazDane();


        Osoba osoba2 = new Osoba("Andrzej" , 29);
        osoba2.pokazDane();

        Osoba osoba3 = new Osoba();
        osoba3.pokazDane();
    }
}
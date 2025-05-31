package Zadanie1;

public class Osoba {
    private String imie;
    private  String naziwsko;
    private int wiek;

    public Osoba(String imie , String naziwsko , int wiek){
        this.imie = imie;
        this.naziwsko = naziwsko;
        this.wiek = wiek;
    }

    public Osoba(String imie , int wiek){
        this.imie = imie;
        this.naziwsko = " ";
        this.wiek = wiek;
    }

    public Osoba(){
        this.imie = " ";
        this.naziwsko = " ";
        this.wiek = 0;
    }

    public  void pokazDane(){
        System.out.println("Imie " + imie + " Nazwisko " + naziwsko + " Wiek " + wiek);
    }
}

package Zadanie3;

public class Student {

    private String imie;
    private String nazwisko;
    private String nrIndeksu;
    private String specjalnosc;
    private int rokStudiow;


    public Student(String imie) {
        this.imie = imie;
        this.nazwisko = "";
        this.nrIndeksu = "";
        this.specjalnosc = "";
        this.rokStudiow = 0;
    }


    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndeksu = "";
        this.specjalnosc = "";
        this.rokStudiow = 0;
    }


    public Student(String imie, String nazwisko, String nrIndeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndeksu = nrIndeksu;
        this.specjalnosc = "";
        this.rokStudiow = 0;
    }


    public Student(String imie, String nazwisko, String nrIndeksu, String specjalnosc, int rokStudiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndeksu = nrIndeksu;
        this.specjalnosc = specjalnosc;
        this.rokStudiow = rokStudiow;
    }


    public void wyswietlDane() {
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Numer indeksu: " + nrIndeksu);
        System.out.println("Specjalność: " + specjalnosc);
        System.out.println("Rok studiów: " + rokStudiow);
        System.out.println();
    }
}
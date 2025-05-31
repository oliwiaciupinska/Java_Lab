package Zadanie3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie ");
        String imie = scanner.nextLine();

        System.out.println("Podaj nazwisko ");
        String nazwisko = scanner.nextLine();

        System.out.println("Podaj numer indeksu ");
        String nrIndeksu = scanner.nextLine();

        System.out.println("Podaj nazwe specjalnosci ");
        String specjalnosc = scanner.nextLine();

        System.out.println("Podaj rok studiow");
        int rokStudiow = scanner.nextInt();

        Student student = new Student(imie , nazwisko , nrIndeksu , specjalnosc , rokStudiow);

        System.out.println("\nWyświetl dane studenta: ");
        student.wyswietlDane();

    }
}

package Zadanie4;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Student[] studenci = new Student[100];

    public static void main(String[] args) {
        inicjalizujTablice();
        boolean wyjscie = true;

        while (wyjscie) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Wprowadź dane studenta");
            System.out.println("2. Edytuj dane studenta");
            System.out.println("3. Usuń dane studenta");
            System.out.println("4. Wyświetl dane studenta");
            System.out.println("5. Wyświetl wszystkich studentów");
            System.out.println("6. Wyświetl zakres studentów");
            System.out.println("7. Wyjście");
            System.out.print("Wybierz opcję: ");

            int wybor = scanner.nextInt();
            scanner.nextLine(); // czyszczenie bufora

            switch (wybor) {
                case 1 -> wprowadzDane();
                case 2 -> edytujDane();
                case 3 -> usunDane();
                case 4 -> wyswietlStudenta();
                case 5 -> wyswietlWszystkich();
                case 6 -> wyswietlZakres();
                case 7 -> {
                    wyjscie = false;
                    System.out.println("Zakończono działanie programu.");
                }
                default -> System.out.println("Nieprawidłowa opcja. Spróbuj ponownie.");
            }
        }
    }

    static void inicjalizujTablice() {
        for (int i = 0; i < studenci.length; i++) {
            studenci[i] = new Student("", "", "", "", 0);
        }
    }

    static void wprowadzDane() {
        System.out.print("Podaj indeks w tablicy (0-99): ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= studenci.length) {
            System.out.println("Błędny indeks.");
            return;
        }

        System.out.print("Imię: ");
        String imie = scanner.nextLine();
        System.out.print("Nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.print("Numer indeksu: ");
        String nrIndeksu = scanner.nextLine();
        System.out.print("Specjalność: ");
        String specjalnosc = scanner.nextLine();
        System.out.print("Rok studiów: ");
        int rokStudiow = scanner.nextInt();
        scanner.nextLine();

        studenci[index] = new Student(imie, nazwisko, nrIndeksu, specjalnosc, rokStudiow);
        System.out.println("Dane zapisane.");
    }

    static void edytujDane() {
        System.out.print("Podaj indeks do edycji (0-99): ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= studenci.length) {
            System.out.println("Błędny indeks.");
            return;
        }

        System.out.print("Nowe imię: ");
        String imie = scanner.nextLine();
        System.out.print("Nowe nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.print("Nowy numer indeksu: ");
        String nrIndeksu = scanner.nextLine();
        System.out.print("Nowa specjalność: ");
        String specjalnosc = scanner.nextLine();
        System.out.print("Nowy rok studiów: ");
        int rokStudiow = scanner.nextInt();
        scanner.nextLine();

        studenci[index] = new Student(imie, nazwisko, nrIndeksu, specjalnosc, rokStudiow);
        System.out.println("Dane zaktualizowane.");
    }

    static void usunDane() {
        System.out.print("Podaj indeks do usunięcia (0-99): ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= studenci.length) {
            System.out.println("Błędny indeks.");
            return;
        }

        studenci[index] = new Student("", "", "", "", 0);
        System.out.println("Dane usunięte (ustawiono domyślne).");
    }

    static void wyswietlStudenta() {
        System.out.print("Podaj indeks do wyświetlenia (0-99): ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= studenci.length) {
            System.out.println("Błędny indeks.");
            return;
        }

        studenci[index].wyswietlDane();
    }

    static void wyswietlWszystkich() {
        for (int i = 0; i < studenci.length; i++) {
            System.out.println("Indeks: " + i);
            studenci[i].wyswietlDane();
        }
    }

    static void wyswietlZakres() {
        System.out.print("Podaj indeks początkowy: ");
        int pocz = scanner.nextInt();
        System.out.print("Podaj indeks końcowy: ");
        int koniec = scanner.nextInt();
        scanner.nextLine();

        if (pocz < 0 || koniec >= studenci.length || pocz > koniec) {
            System.out.println("Błędny zakres.");
            return;
        }

        for (int i = pocz; i <= koniec; i++) {
            System.out.println("Indeks: " + i);
            studenci[i].wyswietlDane();
        }
    }
}

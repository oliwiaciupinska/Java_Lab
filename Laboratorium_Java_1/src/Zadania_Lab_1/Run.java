package Zadania_Lab_1;

import java.util.Scanner;

public class Run {

    public void uruchom(){

        Scanner scanner = new Scanner(System.in);
        boolean wyjscie = true;

        Zadanie1 zadanie1 = new Zadanie1();
        Zadanie2 zadanie2 = new Zadanie2();
        Zadanie3 zadanie3 = new Zadanie3();
        Zadanie4 zadanie4 = new Zadanie4();
        Zadanie5 zadanie5 = new Zadanie5();
        Zadanie6 zadanie6 = new Zadanie6();
        Zadanie7 zadanie7 = new Zadanie7();
        while (wyjscie){
            System.out.println("--- Menu ---");
            System.out.println("1.Zadanie");
            System.out.println("2.Zadanie");
            System.out.println("3.Zadanie");
            System.out.println("4.Zadanie");
            System.out.println("5.Zadanie");
            System.out.println("6.Zadanie");
            System.out.println("7.Zadanie");
            System.out.println("8.Wyjśćie");

            int wybor = scanner.nextInt();
            switch (wybor){
                case 1:
                    zadanie1.zad1();
                    break;
                case 2:
                    zadanie2.zad2();
                    break;
                case 3:
                    zadanie3.zad3();
                    break;
                case 4:
                    zadanie4.zad4();
                    break;
                case 5:
                    zadanie5.zad5();
                    break;
                case 6:
                    zadanie6.zad6();
                    break;
                case 7:
                    zadanie7.zad7();
                    break;
                case 8:
                    wyjscie = false;
                    System.out.println("Koniec Pracy Programu");
                    break;
                default:
                    System.out.println("Wybrano błędną opcje");
            }
        }scanner.close();
    }
}

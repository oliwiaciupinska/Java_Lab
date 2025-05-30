package Zadania_Lab_1;

import java.util.Scanner;

public class Zadanie3 {

    Scanner scanner = new Scanner(System.in);
    public  void zad3(){

        System.out.println("Podaj dowolna liczbe: ");
        int a = scanner.nextInt();
        boolean parzysta = true;

        if(a % 2 == 0){
            System.out.println(parzysta);
        }else{
            System.out.println("Podana liczba jest nie parzysta");
        }
    }
}

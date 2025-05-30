package Zadania;

import java.util.Scanner;

public class Zadanie2 {

    Scanner scanner = new Scanner(System.in);
    public void zad2(){

        int i=0;
        int dodatnie = 0;
        int ujemne =0;

        System.out.println("Podaj 10 liczb");
        int n =10;

        while(i<n){
            System.out.println("Podaj liczby");
            int liczby = scanner.nextInt();

            if(liczby>0){
                ++dodatnie;
            }else{
                ++ujemne;
            }
            ++i;
        }
        System.out.println("Liczb dodatnich jest " + dodatnie + " , a liczb ujemnych jest" + ujemne);
    }
}

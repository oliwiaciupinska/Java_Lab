package Zadania;

public class Zadanie2 {

    public void zad2(){

        int[] parzysta = {12,8,14,16};
        int[] nieparzysta = {5,2,5,7,1};


        System.out.println("\nCo drugi element z tablicy parzystej");
        for (int i = 0; i < parzysta.length ; i+=2){
            System.out.println(parzysta[i] + " ");
           }
        System.out.println();

        System.out.println("Co drugi element z tablicy nieparzystej");
        for (int i =0; i < nieparzysta.length; i += 2){
            System.out.println(nieparzysta[i] + " ");
        }
        System.out.println();
    }
}

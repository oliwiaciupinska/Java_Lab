package Zadanie2;

public class Main {
    public static void main(String[] args) {
        // 6. Tworzenie obiektów Punkt
        Punkt p1 = new Punkt();
        Punkt p2 = new Punkt(5, 10);
        Punkt p3 = new Punkt(-2, 7);

        // 7. Użycie metod
        p1.opis();
        p2.przesun(3, -2);
        p2.opis();
        p3.zeruj();
        p3.opis();

        // 9. Obiekty klas dziedziczących z Figura
        Figura f = new Figura("zielony");
        Prostokat prostokat = new Prostokat(4, 6, "czerwony");
        Trojkat trojkat = new Trojkat(3, 5, "niebieski");

        f.opis();
        prostokat.opis();
        trojkat.opis();

        // 10. Obiekt klasy Okrag
        Okrag okrag = new Okrag(new Punkt(2, 2), 5);
        okrag.opis();
        System.out.println("Powierzchnia: " + okrag.getPowierzchnia());
        System.out.println("Średnica: " + okrag.getSrednica());
        System.out.println("Czy punkt (3,3) jest w środku? " + okrag.wSrodku(new Punkt(3, 3)));

        // 15. Przesunięcie prostokąta
        prostokat.przesun(3, 5);

        // 17. Obiekt Kwadrat
        Kwadrat kw = new Kwadrat(4, "żółty");
        kw.opis();
        kw.setBok(6);
        System.out.println("Nowy bok kwadratu: " + kw.getBok());
    }
}

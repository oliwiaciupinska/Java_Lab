package  Zadanie2;

// Główna metoda programu
public class Main{

    public static void main(String[] args) {
    Student s1 = new Student("Anna");
    Student s2 = new Student("Jan", "Kowalski");
    Student s3 = new Student("Maria", "Nowak", "S12345");
    Student s4 = new Student("Piotr", "Wiśniewski", "S54321", "Informatyka", 2);

    s1.wyswietlDane();
    s2.wyswietlDane();
    s3.wyswietlDane();
    s4.wyswietlDane();
}
}

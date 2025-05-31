package Zadanie2;

public class Kwadrat extends Prostokat {
    public Kwadrat(float bok, String kolor) {
        super(bok, bok, kolor);
    }

    public float getBok() {
        return szer;
    }

    public void setBok(float bok) {
        this.szer = bok;
        this.wys = bok;
    }

    @Override
    public void opis() {
        System.out.println("Kwadrat koloru " + kolor + " o boku: " + szer);
    }
}

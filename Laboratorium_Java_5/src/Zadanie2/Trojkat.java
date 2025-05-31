package Zadanie2;

public class Trojkat extends Figura {
    private float wys;
    private float podst;

    public Trojkat() {}

    public Trojkat(float wys, float podst, String kolor) {
        super(kolor);
        this.wys = wys;
        this.podst = podst;
    }

    @Override
    public void opis() {
        System.out.println("Trójkąt koloru " + kolor + " o podstawie " + podst + " i wysokości " + wys);
    }
}

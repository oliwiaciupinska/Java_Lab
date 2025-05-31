package Zadanie2;

public class Prostokat extends Figura {
    protected float wys;
    protected float szer;

    public Prostokat() {
        this.wys = 0;
        this.szer = 0;
    }

    public Prostokat(float wys, float szer) {
        this.wys = wys;
        this.szer = szer;
    }

    public Prostokat(float wys, float szer, String kolor) {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }

    public void przesun(float x, float y) {
        System.out.println("Prostokąt przesunięty o (" + x + ", " + y + ")");
    }

    @Override
    public void opis() {
        System.out.println("Prostokąt koloru " + kolor + " o wymiarach: " + szer + " x " + wys);
    }
}

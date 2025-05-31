package Zadanie2;

public class Punkt {
    public int x;
    public int y;

    public Punkt() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    public void zeruj() {
        x = 0;
        y = 0;
    }

    public void opis() {
        System.out.println("Punkt o współrzędnych: (" + x + ", " + y + ")");
    }

    public void przesun(int dx, int dy) {
        x += dx;
        y += dy;
    }
}

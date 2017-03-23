package liikkuva.olio;

import java.awt.Graphics;

public class Olio {

    private int x;
    private int y;

    public Olio(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void siirry(int xmuutos, int ymuutos) {
        this.x += xmuutos;
        this.y += ymuutos;
    }

    public void piirra(Graphics graphics) {
        graphics.fillOval(x, y, 20, 20);
    }
}
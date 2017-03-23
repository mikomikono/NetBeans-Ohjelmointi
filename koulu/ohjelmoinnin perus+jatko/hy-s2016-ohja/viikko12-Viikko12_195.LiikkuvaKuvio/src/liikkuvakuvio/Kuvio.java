package liikkuvakuvio;

import java.awt.Graphics;

public abstract class Kuvio {
    private int x;
    private int y;
    
    public Kuvio(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void siirra(int dx, int dy){
        this.x+=dx;
        this.y+=dy;
    }
    
    public abstract void piirra(Graphics graphics);
}

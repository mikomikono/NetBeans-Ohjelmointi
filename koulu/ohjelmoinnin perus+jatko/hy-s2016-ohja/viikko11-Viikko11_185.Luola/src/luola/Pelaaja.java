package luola;

public class Pelaaja {
    private int x;
    private int y;
    private int leveys;
    private int korkeus;
    
    public Pelaaja(int leveys, int korkeus){
        this.x=0;
        this.y=0;
        this.leveys=leveys;
        this.korkeus=korkeus;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void liiku(char ch){
        if (ch=='a'&&x-1>=0){
            this.x-=1;
        }
        if (ch=='w'&&y-1>=0){
            this.y-=1;
        }
        if (ch=='s'&&y+1<this.korkeus){
            this.y+=1;
        }
        if (ch=='d'&&x+1<this.leveys){
            this.x+=1;
        }
    }
    
    public boolean samaKoordinaatti(int kx, int ky){
        return (kx==this.x&&ky==this.y);
    }
    
    @Override
    public String toString(){
        return "@ "+this.x+" "+this.y;
    }
}

package luola;

public class Hirvio {
    private int x;
    private int y;
    private int leveys;
    private int korkeus;
    
    public Hirvio(int x, int y, int leveys, int korkeus){
        this.x=x;
        this.y=y;
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
    
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public boolean equals(Hirvio hirvio){
        return (this.x==hirvio.y&&this.y==hirvio.y);
    }
    
    public boolean samaKoordinaatti(int kx, int ky){
        return (kx==this.x&&ky==this.y);
    }
    
    @Override
    public String toString(){
        return "h "+this.x+" "+this.y;
    }
}

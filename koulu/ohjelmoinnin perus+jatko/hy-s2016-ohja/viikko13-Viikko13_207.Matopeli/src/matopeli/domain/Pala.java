package matopeli.domain;

public class Pala {
    private int x;
    private int y;
    
    public Pala(int x ,int y){
        this.x=x;
        this.y=y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public boolean osuu(Pala pala){
        return this.x==pala.getX()&&this.y==pala.getY();
    }
    
    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
}

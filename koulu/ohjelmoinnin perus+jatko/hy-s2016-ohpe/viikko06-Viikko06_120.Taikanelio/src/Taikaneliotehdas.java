
public class Taikaneliotehdas {

    public Taikanelio luoTaikanelio(int koko) {

        Taikanelio nelio = new Taikanelio(koko);
        // toteuta taikaneliön luominen Siamese method -algoritmilla tänne
        if (koko%2!=0){
            int x=koko/2;
            int y=0;
            nelio.asetaArvo(x, y, 1);
            for(int i=2;i<=koko*koko;i++){
                x+=1;
                if (x>=koko){
                    x=0;
                }
                y-=1;
                if (y<0){
                    y=koko-1;
                }
                if (nelio.annaArvo(x, y)!=0){
                    x-=1;
                    if(x<0){
                        x=koko-1;
                    }
                    y+=2;
                    if(y==koko){
                        y=0;
                    }
                    if(y==koko+1){
                        y=1;
                    }
                }
                nelio.asetaArvo(x,y,i);
            }
        }
//        int i=1;
//        for (int x=0;x<koko;x++){
//            for (int y=0;y<koko;y++){
//                nelio.asetaArvo(x, y, i);
//                i++;
//            }
//        }
        return nelio;
    }

}

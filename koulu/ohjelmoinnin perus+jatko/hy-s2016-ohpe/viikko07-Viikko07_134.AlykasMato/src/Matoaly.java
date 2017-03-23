
import matopeli.Matopeli;

public class Matoaly {

    public String annaSiirto(Matopeli matopeli) {
        // vaihtoehtoja ovat: YLOS, ALAS, VASEN, OIKEA

        int[][] pelialue = matopeli.annaAlusta();
        // voit käyttää allaolevaa tulostusta pelialueen tulostamiseen konsoliin
//        for (int y = pelialue[0].length - 1; y >= 0; y--) {
//            for (int x = 0; x < pelialue.length; x++) {
//                if(pelialue[x][y] >= 0) {
//                    System.out.print(" ");
//                }
//                System.out.print(pelialue[x][y]);
//            }
//
//            System.out.println("");
//        }
//        System.out.println("");

        if (matopeli.omenaX()>matopeli.matoX()&&pelialue[matopeli.matoX()+1][matopeli.matoY()]!=-1){
            return "OIKEA";
        }
        if (matopeli.omenaX()<matopeli.matoX()&&pelialue[matopeli.matoX()-1][matopeli.matoY()]!=-1){
            return "VASEN";
        }
        if (matopeli.omenaY()>matopeli.matoY()&&pelialue[matopeli.matoX()][matopeli.matoY()+1]!=-1){
            return "YLOS";
        }
        if (matopeli.omenaY()<matopeli.matoY()&&pelialue[matopeli.matoX()][matopeli.matoY()-1]!=-1){
            return "ALAS";
        }
        int matoaVasemmalla=0;
        int matoaOikealla=0;
        int matoaYlhaalla=0;
        int matoaAlhaalla=0;
        
        for (int i=matopeli.matoX();i>=0;i--){
            if (pelialue[i][matopeli.matoX()]==-1){
                matoaVasemmalla++;
            }
        }
        for (int i=matopeli.matoX();i<matopeli.leveys();i++){
            if (pelialue[i][matopeli.matoX()]==-1){
                matoaOikealla++;
            }
        }
        for (int i=matopeli.matoY();i<=0;i--){
            if (pelialue[matopeli.matoY()][i]==-1){
                matoaAlhaalla++;
            }
        }
        for (int i=matopeli.matoY();i<matopeli.korkeus();i++){
            if (pelialue[matopeli.matoY()][i]==-1){
                matoaYlhaalla++;
            }
        }
        if(matopeli.matoX()+1>=pelialue.length|matopeli.matoX()-1<0){
            if(matopeli.matoY()+1>=pelialue.length|matopeli.matoY()-1<0){
                return "ALAS";
            }
            return "YLOS";
        }
        if(matopeli.matoY()+1>=pelialue.length|matopeli.matoY()-1<0){
            if(matopeli.matoX()+1>=pelialue.length|matopeli.matoX()-1<0){
                return "VASEN";
            }
            return "OIKEA";
        }
        if (pelialue[matopeli.matoX()+1][matopeli.matoY()]!=-1&&matoaVasemmalla>=matoaOikealla){
            return "OIKEA";
        }
        if (pelialue[matopeli.matoX()-1][matopeli.matoY()]!=-1&&matoaOikealla>=matoaVasemmalla){
            return "VASEN";
        }
        if (pelialue[matopeli.matoX()][matopeli.matoY()+1]!=-1&&matoaAlhaalla>=matoaYlhaalla){
            return "YLOS";
        }
        if (pelialue[matopeli.matoX()][matopeli.matoY()-1]!=-1&&matoaYlhaalla>=matoaAlhaalla){
            return "ALAS";
        }
        return "YLOS";

    }
}

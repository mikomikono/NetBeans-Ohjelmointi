package varastonhallinta;

import java.util.*;

public class VarastojenHallinta {
    public List<Varasto> varastot;

    public VarastojenHallinta() {
        this.varastot = new ArrayList<>();
    }
    
    public void tee(String komento){
        String[] sanat = komento.split(" ");
        switch (sanat[0]) {
            case "lisaa":
                lisaa(sanat[1], sanat[2]);
                break;
            case "listaa":
                listaa(sanat[1]);
                break;
            case "hae":
                hae(sanat[1], sanat[2]);
                break;
            case "poista":
                poista(sanat[1],sanat[2]);
                break;
            default:
                System.out.println("Tuntematon komento "+sanat[0]);
                break;
        }
    }
    
    private void lisaa(String nimi, String esine) {
        Varasto varasto = etsiVarasto(nimi);
        varasto.lisaaEsine(esine);
    }
    
    private void listaa(String nimi) {
        Varasto varasto = etsiVarasto(nimi);
        System.out.println("Listataan varaston "+nimi+" sisältö"+ "\n" +
                varasto);
    }

    private void hae(String nimi, String esine) {
        Varasto varasto = etsiVarasto(nimi);
        if (varasto.haeEsine(esine)) {
            System.out.println("Esine "+esine+" löytyy varastosta "+nimi);
        } else {
            System.out.println("Esinettä "+esine+" ei löydy varastosta "+nimi);
        }
    }
    
    private void poista(String nimi, String esine) {
        Varasto varasto = etsiVarasto(nimi);
        varasto.poistaEsine(esine);
    }

    private Varasto etsiVarasto(String nimi) {
        Varasto varasto = null;
        for (Varasto v : varastot) {
            if (v.getNimi().equals(nimi)) {
                varasto = v;
            }
        } if (varasto == null) {
            varasto = new Varasto(nimi);
            varastot.add(varasto);
        }
        return varasto;
    }
}

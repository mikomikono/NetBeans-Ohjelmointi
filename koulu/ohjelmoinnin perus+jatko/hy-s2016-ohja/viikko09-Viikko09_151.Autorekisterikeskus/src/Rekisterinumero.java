
public class Rekisterinumero {
    // älä muuta luokan jo valmiina olevia osia

    // HUOM: oliomuuttujissa on määre final eli niiden arvoa ei voi muuttaa!
    private final String rekNro;
    private final String maa;

    public Rekisterinumero(String maa, String rekNro) {
        this.rekNro = rekNro;
        this.maa = maa;
    }

    @Override
    public String toString() {
        return maa + " " + rekNro;
    }
    
    @Override
    public boolean equals(Object object){
        return object.toString().equals(this.toString());
    }
    
    @Override
    public int hashCode(){
        return this.maa.hashCode()*this.rekNro.hashCode();
    }

}

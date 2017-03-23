public class BinaariHaku {

    public static boolean hae(int[] taulukko, int etsittavaLuku) {
        int alku = 0;
        int loppu = taulukko.length - 1;

        // tarvitset ainakin toistolauseen, missä katsotaan aina taulukon
        // keskimmäistä alkiota, sekä jonkinlaisen toiminnallisuuden
        // hakualueen jatkuvaan pienentämiseen
        if (taulukko[alku]>etsittavaLuku|taulukko[loppu]<etsittavaLuku){
            return false;
        }
        if (taulukko[alku]==etsittavaLuku|taulukko[loppu]==etsittavaLuku){
            return true;
        }
        while (alku!=loppu){
            int i=keskiarvo(alku,loppu);
            if (taulukko[i]==etsittavaLuku){
                return true;
            }
            if (taulukko[i]<etsittavaLuku){
                alku=i+1;
            } else {
                loppu=i;
            }
        }
        if (taulukko[loppu]==etsittavaLuku){
            return true;
        } else {
            return false;
        }
    }
    
    public static int keskiarvo(int ekaLuku, int tokaLuku){
        int keskiarvo = (ekaLuku+tokaLuku)/2;
        return keskiarvo;
    }
}

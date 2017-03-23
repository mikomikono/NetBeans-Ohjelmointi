public class Main {
    public static void main(String[] args) {
        Lastiruuma lastiruuma = new Lastiruuma(1000);
        lisaaMatkalaukutTiiliskivilla(lastiruuma);
        System.out.println(lastiruuma);
    }

    public static void lisaaMatkalaukutTiiliskivilla(Lastiruuma lastiruuma) {
        // 100 matkalaukun lisääminen, jokaiseen tulee tiiliskivi
        for (int i=1; i<=100;i++){
            Tavara tiiliskivi = new Tavara("tiiliskivi",i);
            Matkalaukku laukku = new Matkalaukku(i);
            laukku.lisaaTavara(tiiliskivi);
            lastiruuma.lisaaMatkalaukku(laukku);
        }
    }
}
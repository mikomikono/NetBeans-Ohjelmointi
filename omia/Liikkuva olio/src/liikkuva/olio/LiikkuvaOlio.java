package liikkuva.olio;

import javax.swing.SwingUtilities;

public class LiikkuvaOlio {


    public static void main(String[] args) {
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(new Olio(30,30));
        SwingUtilities.invokeLater(kayttoliittyma);
    }
    
}

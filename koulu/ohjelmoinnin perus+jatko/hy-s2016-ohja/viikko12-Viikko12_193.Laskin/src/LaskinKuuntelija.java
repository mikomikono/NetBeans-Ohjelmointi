
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class LaskinKuuntelija implements ActionListener{
    private JButton plus;
    private JButton miinus;
    private JButton z;
    private JTextField tuloste;
    private JTextField syote;
    
    public LaskinKuuntelija(JTextField tuloste, JTextField syote,JButton plus, JButton miinus, JButton z){
        this.tuloste=tuloste;
        this.syote=syote;
        this.plus=plus;
        this.miinus=miinus;
        this.z=z;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == z) {
            tuloste.setText("0");
            syote.setText("");
            z.setEnabled(false);
        }
        int syotetty=0;
        int tulostettu=0;
        try {
            syotetty = Integer.parseInt(syote.getText());
            tulostettu = Integer.parseInt(tuloste.getText());
        } catch (Exception e) {
            syote.setText("");
        }
        if (ae.getSource() == plus) {
            int summa = tulostettu+syotetty;
            tuloste.setText(""+summa);
            z.setEnabled(true);
        } else if (ae.getSource() == miinus) {
            int vahennys = tulostettu-syotetty;
            tuloste.setText(""+vahennys);
            z.setEnabled(true);
        }
        syote.setText("");
    }
}

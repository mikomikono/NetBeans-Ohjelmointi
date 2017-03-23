
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraafinenLaskin implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Laskin");
        frame.setPreferredSize(new Dimension(300,150));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        luoKomponentit(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(3,1);
        JTextField tulostuskentta = new JTextField("0");
        tulostuskentta.setEnabled(false);
        JTextField syotekentta = new JTextField();

        JPanel panel = new JPanel(new GridLayout(1,3));
        JButton plus = new JButton("+");
        JButton miinus = new JButton("-");
        JButton z = new JButton("Z");
        z.setEnabled(false);    
                
        panel.add(plus);
        panel.add(miinus);
        panel.add(z);
        
        LaskinKuuntelija kuuntelija = new LaskinKuuntelija(tulostuskentta, syotekentta,plus,miinus,z);
        plus.addActionListener(kuuntelija);
        miinus.addActionListener(kuuntelija);
        z.addActionListener(kuuntelija);

        container.setLayout(layout);
        container.add(tulostuskentta);
        container.add(syotekentta);
        container.add(panel);
    }

    public JFrame getFrame() {
        return frame;
    }
}

package liikkuva.olio;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Piirtoalusta extends JPanel {

    private Olio olio;

    public Piirtoalusta(Olio olio) {
        super.setBackground(Color.WHITE);
        this.olio = olio;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.BLUE);
        olio.piirra(graphics);
    }
}
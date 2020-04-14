package Epoch;

import java.awt.*;
import javax.swing.JPanel;

public class BoardGUI extends JPanel {

    public BoardGUI(){

    }


    /**
     * Paint JPanel with this method
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //create coloring for hand and floor containers
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, 1054, 170);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 170, 1054, 521);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 691, 1054, 170);

        //opponent hand containers
        for (Integer i = 0; i < 7; i++) {
            g.setColor(Color.BLACK);
            g.fillRect(20 + (30 * (i + 1) + (i * 110)), 9, 110, 150);
            g.setColor(Color.DARK_GRAY);
            g.fillRect(25 + (30 * (i + 1) + (i * 110)), 14, 100, 140);
        }

        //opponent floor containers
        for (Integer i = 0; i < 7; i++) {
            g.setColor(new Color(220,20,60));
            g.fillRect(20 + (30 * (i + 1) + (i * 110)), 180, 110, 150);
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(25 + (30 * (i + 1) + (i * 110)), 185, 100, 140);
        }

        //user floor containers
        for (Integer i = 0; i < 7; i++) {
            g.setColor(new Color(34, 139, 34));
            g.fillRect(20 + (30 * (i + 1) + (i * 110)), 531, 110, 150);
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(25 + (30 * (i + 1) + (i * 110)), 536, 100, 140);
        }

        //user hand containers
        for (Integer i = 0; i < 7; i++) {
            g.setColor(Color.BLACK);
            g.fillRect(20 + (30 * (i + 1) + (i * 110)), 701, 110, 150);
            g.setColor(Color.DARK_GRAY);
            g.fillRect(25 + (30 * (i + 1) + (i * 110)), 706, 100, 140);
        }

        //attack container
        g.setColor(new Color(0,0,128));
        g.fillRect(330, 355, 110, 150);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(335, 360, 100, 140);

        //defend container
        g.setColor(new Color(255,140,0));
        g.fillRect(610, 355, 110, 150);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(615, 360, 100, 140);

        repaint();

    }
}

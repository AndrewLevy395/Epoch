package Epoch;

import java.awt.*;
import javax.swing.JPanel;

public class BoardGUI extends JPanel {
    Game game;

    public BoardGUI(Game game){
        this.game = game;

    }


    /**
     * Paint JPanel with this method
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //create coloring for hand and floor
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, 1054, 170);
        g.setColor(Color.GRAY);
        g.fillRect(0, 170, 1054, 521);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 691, 1054, 170);

        //hand border
        g.setColor(Color.BLACK);
        g.fillRect(0, 168, 1054, 4);
        g.fillRect(0, 689, 1054, 4);

        //opponent hand containers
        for (Integer i = 0; i < 7; i++) {
            g.setColor(Color.BLACK);
            g.fillRect(20 + (30 * (i + 1) + (i * 110)), 9, 110, 150);
            g.setColor(Color.DARK_GRAY);
            g.fillRect(25 + (30 * (i + 1) + (i * 110)), 14, 100, 140);
        }

        //opponent floor containers
        for (Integer i = 0; i < 7; i++) {
            if(i == 1){
                g.setColor(new Color(255,140,0));
            } else if (i == 0){
                g.setColor(new Color(128,0,128));
            } else {
                g.setColor(new Color(220,20,60));
            }
            g.fillRect(20 + (30 * (i + 1) + (i * 110)), 187, 110, 150);
            g.setColor(Color.GRAY);
            g.fillRect(25 + (30 * (i + 1) + (i * 110)), 192, 100, 140);
        }

        //user floor containers
        for (Integer i = 0; i < 7; i++) {
            if(i == 1){
                g.setColor(new Color(255,140,0));
            } else if (i == 0){
                g.setColor(new Color(128,0,128));
            } else {
                g.setColor(new Color(34, 139, 34));
            }
            g.fillRect(20 + (30 * (i + 1) + (i * 110)), 523, 110, 150);
            g.setColor(Color.GRAY);
            g.fillRect(25 + (30 * (i + 1) + (i * 110)), 528, 100, 140);
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
        g.fillRect(470, 355, 110, 150);
        g.setColor(Color.GRAY);
        g.fillRect(475, 360, 100, 140);

        //defend container
        g.setColor(new Color(0,0,128));
        g.fillRect(750, 355, 110, 150);
        g.setColor(Color.GRAY);
        g.fillRect(755, 360, 100, 140);

        displayLeaders(g);
        displayHand(g);
        displayOppHand(g);

        repaint();

    }

    public void displayLeaders(Graphics g){
        g.setColor(Color.LIGHT_GRAY);
        //opponent leader
        g.fillRect(55, 192, 100, 30);
        g.fillRect(55, 302, 100, 30);

        //user leader
        g.fillRect(55, 528, 100, 30);
        g.fillRect(55, 638, 100, 30);

        //writing for both leaders
        g.setColor(Color.BLACK);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        g.drawString(game.getOppTeam().getLeader().getName(), 60, 215);
        g.drawString(game.getUserTeam().getLeader().getName(), 60, 551);
        g.drawString(game.getOppTeam().getEpoch().getName(), 60, 325);
        g.drawString(game.getUserTeam().getEpoch().getName(), 60, 661);

        //middle section
        g.setColor(Color.DARK_GRAY);
        g.fillRect(55, 222, 100, 80);
        g.fillRect(55, 558, 100, 80);
    }

    public void displayHand(Graphics g){
        for (Integer i = 0; i < 7; i++) {
            if(game.getUserTeam().getHand()[i] != null){
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(25 + (30 * (i + 1) + (i * 110)), 706, 100, 30);
                g.setColor(Color.DARK_GRAY);
                g.fillRect(25 + (30 * (i + 1) + (i * 110)), 736, 100, 110);
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(25 + (30 * (i + 1) + (i * 110)), 816, 30, 30);
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(95 + (30 * (i + 1) + (i * 110)), 816, 30, 30);
                g.setColor(Color.BLACK);
                g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
                g.drawString(game.getUserTeam().hand[i].getName(), 32 + (30 * (i + 1) + (i * 110)), 728);
                String cardAttack = game.getUserTeam().hand[i].getAttack().toString();
                if(cardAttack.equals("-1")){
                    cardAttack = "E";
                    g.setFont(new Font("TimesRoman", Font.PLAIN, 18));
                }
                g.drawString(cardAttack, 34 + (30 * (i + 1) + (i * 110)), 839);
                g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
                String cardDefense = game.getUserTeam().hand[i].getDefense().toString();
                if(cardDefense.equals("-1")){
                    cardDefense = "--";
                    g.setFont(new Font("TimesRoman", Font.PLAIN, 18));
                }
                g.drawString(cardDefense, 105 + (30 * (i + 1) + (i * 110)), 839);
            }
        }
    }

    public void displayOppHand(Graphics g){
        for (Integer i = 0; i < 7; i++) {
            if(game.getOppTeam().getHand()[i] != null){
                g.setColor(Color.BLACK);
                g.fillRect(20 + (30 * (i + 1) + (i * 110)), 9, 110, 150);
            }
        }
    }
}

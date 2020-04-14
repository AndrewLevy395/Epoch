package Epoch;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class AppGUI {

    private JPanel contentPane;
    Integer width;
    Integer height;

    public AppGUI(Integer width, Integer height){
        //set height and width
        this.width = width;
        this.height = height;

        //create new frame
        JFrame frame = new JFrame("Project Epoch");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(this.width,this.height);
        frame.setVisible(true);
        frame.setResizable(false);

        //set content pane
        contentPane = new JPanel();
        Border border = BorderFactory.createLineBorder(Color.BLACK, 5);
        contentPane.setBorder(border);
        frame.setContentPane(contentPane);
        contentPane.setLayout(null);

        //display board
        BoardGUI boardgui = new BoardGUI();
        boardgui.setForeground(Color.YELLOW);
        boardgui.setBounds(5, 5, 1054, 861);
        contentPane.add(boardgui);

    }
}

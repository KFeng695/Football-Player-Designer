package View;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;

public class NorthPanel extends JPanel
{

    public NorthPanel()
    {
        super();
        setBackground(Color.black);
        GridLayout gr = new GridLayout(1, 1);
        setLayout(gr);
        JButton b1 = new JButton("North Panel");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        add(b1);
    }
    
    
   
}

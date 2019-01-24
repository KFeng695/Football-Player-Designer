package View;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class SouthPanel extends JPanel
{

    public SouthPanel()
    {
        super();
        setBackground(Color.black);
        GridLayout gr = new GridLayout(1, 1, 10, 10);
        setLayout(gr);
        JButton b1 = new JButton("South Panel");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        add(b1);
    }
}

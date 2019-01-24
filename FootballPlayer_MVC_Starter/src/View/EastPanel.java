package View;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class EastPanel extends JPanel
{

    public EastPanel()
    {
        super();
        setBackground(Color.pink);
        // GridLayout gr = new GridLayout(1,1,10,10);
        // setLayout(gr);
        add(new JButton("East Panel"));
    }
}

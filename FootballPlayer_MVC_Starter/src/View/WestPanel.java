package View;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class WestPanel extends JPanel
{

    public WestPanel()
    {
        super();
        setBackground(Color.yellow);
        // GridLayout gr = new GridLayout(1,1,10,10);
        // setLayout(gr);
        add(new JButton("West Panel"));
    }
}

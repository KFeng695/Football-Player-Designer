package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;

public class CenterPanel extends JPanel
{
    public columnPanel colp;
    public playerPanel plap;

    public CenterPanel()
    {
        super();
        setBackground(Color.white);
//        GridLayout gr = new GridLayout(2,1);
//        setLayout(gr);
        
        colp = new columnPanel();
        plap = new playerPanel();
        
        add(colp, BorderLayout.NORTH);
        add(plap, BorderLayout.CENTER);
        
    }
    
    public columnPanel getcolp()
    {
        return colp;
    }
    
    public playerPanel getplap()
    {
        return plap;
    }
    
}

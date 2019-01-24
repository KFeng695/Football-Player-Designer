/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author kkf5087
 */
public class playerPanel extends JPanel
{

    public playerPanel() 
    {
        super();
        setBackground(Color.white);
        GridLayout gr = new GridLayout(1,7);
        setLayout(gr);
    }
    
    private JButton[] jb = new JButton[7];
    
    public void makeButtons(ArrayList<String> b)
    {
        for (int i = 0; i < 7; i++)
        {
            jb[i] = new JButton(b.get(i));
            add(jb[i]);
    }
    
}
}

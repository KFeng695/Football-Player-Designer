package View;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class InitialPanel extends JPanel {

    NorthPanel np;
    SouthPanel sp;
    EastPanel ep;
    WestPanel wp;
    CenterPanel cp;

    public InitialPanel() {
        super();
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        np = new NorthPanel();
        sp = new SouthPanel();
        ep = new EastPanel();
        wp = new WestPanel();
        cp = new CenterPanel();
        add(np, BorderLayout.NORTH);
        add(sp, BorderLayout.SOUTH);
        add(ep, BorderLayout.EAST);
        add(wp, BorderLayout.WEST);
        add(cp, BorderLayout.CENTER);
    }

    public CenterPanel getCenterPanel() {
        return cp;
    }

    public NorthPanel getNorthPanel() {
        return np;
    }

}

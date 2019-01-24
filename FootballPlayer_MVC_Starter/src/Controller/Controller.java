package Controller;

import Model.Model;
import View.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controller
{

    private Model model;
    private View view;

    public Controller(Model imodel, View iview)
    {
        model = imodel;
        view = iview;
        view.initialSetup();
        view.getInitialframe().getInitialPanel().getCenterPanel().colp.makeButtons(model.getFPData().getColumnNames());
        for(int i =0;i<20;i++)
        {
            view.getInitialframe().getInitialPanel().getCenterPanel().plap.makeButtons(model.getFPData().getLine(i));
        }
        
    }

    public Model getModel()
    {
        return model;
    }

    public void setModel(Model model)
    {
        this.model = model;
    }

    public View getView()
    {
        return view;
    }

    public void setView(View view)
    {
        this.view = view;
    }

}

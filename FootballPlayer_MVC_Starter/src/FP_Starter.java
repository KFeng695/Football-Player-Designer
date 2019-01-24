
import Model.Model;
import Controller.Controller;
import View.View;

public class FP_Starter
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
    }

}

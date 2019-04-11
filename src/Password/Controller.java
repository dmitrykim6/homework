package Password;

public class Controller {
    Model model;
    Controller(Viewer viewer){
        model = new Model(viewer);
    }
}

package Password;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Viewer {
    Viewer(){
        Controller controller = new Controller(this);

        JFrame frame = new JFrame("Login and password");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);




        frame.setVisible(true);
    }
}

package Password;

import javafx.scene.control.ButtonType;

import javax.swing.JPasswordField;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.SwingConstants;


public class Viewer {
    JFrame frame;
    JTextField loginField;
    JPasswordField passField;
    JFrame errFrame;
    JLabel errMsg;

    Viewer(){
        Controller controller = new Controller(this);

        frame = new JFrame("Login and password");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JLabel loginLabel = new JLabel("LOGIN:");
        loginLabel.setBounds(20, 30, 100, 30);

        JLabel passwordLabel = new JLabel("PASSWORD:");
        passwordLabel.setBounds(20, 70, 100, 30);

        loginField = new JTextField();
        loginField.setBounds(140, 30,   120, 30);

        passField = new JPasswordField();
        passField.setBounds(140, 70, 120, 30);


        JButton buttonOk = new JButton("OK");
        buttonOk.setBounds(100, 120, 100, 30);
        buttonOk.addActionListener(controller);
        buttonOk.setActionCommand("check");


        frame.add(loginField);
        frame.add(passField);
        frame.add(loginLabel);
        frame.add(passwordLabel);
        frame.add(buttonOk);
        frame.setVisible(true);

        //Error window

        errFrame = new JFrame("Error");
        errFrame.setSize(250, 100);
        errFrame.setLocationRelativeTo(null);
        errFrame.setLayout(null);
        errFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        errMsg = new JLabel("Input error!");
        errMsg.setBounds(105, 0, 90, 40);
        errMsg.setHorizontalTextPosition(SwingConstants.CENTER);

        JButton errOkButton = new JButton("OK");
        errOkButton.setSize(60, 40);
        errOkButton.setBounds(95, 35, 60, 30);
        errOkButton.addActionListener(controller);
        errOkButton.setActionCommand("errOk");

        errFrame.add(errMsg);
        errFrame.add(errOkButton);
        errFrame.setVisible(false);
    }
}

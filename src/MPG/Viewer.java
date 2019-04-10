package MPG;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.*;

import javax.swing.JButton;


public class Viewer {
    Viewer(){
        JFrame frame = new JFrame("MPG");
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("MPG", SwingConstants.CENTER);
        nameLabel.setFont(nameLabel.getFont ().deriveFont (32.0f));
        nameLabel.setBounds(10,10,380,40);





        frame.add(nameLabel);
        frame.setVisible(true);
    }
}

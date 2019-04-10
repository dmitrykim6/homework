package MPG;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.SwingConstants;



public class Viewer {
    JTextField litresTextField;
    JTextField kilometersTextField;
    JLabel resultText;

    Viewer(){
        Controller controller = new Controller(this);

        JFrame frame = new JFrame("MPG");
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("MPG", SwingConstants.CENTER);
        nameLabel.setFont(nameLabel.getFont().deriveFont (32));
        nameLabel.setBounds(10,10,280,40);

        JLabel litresLabel = new JLabel("Litres");
        litresLabel.setFont(litresLabel.getFont().deriveFont(24));
        litresLabel.setBounds(30, 80, 100, 20);

        litresTextField = new JTextField();
        litresTextField.setBounds(150, 80, 120, 20);
        litresTextField.setHorizontalAlignment(SwingConstants.RIGHT);

        JLabel kilometersLabel = new JLabel("Kilometers");
        kilometersLabel.setFont(kilometersLabel.getFont().deriveFont(24));
        kilometersLabel.setBounds(30, 120, 100, 20);


        kilometersTextField = new JTextField();
        kilometersTextField.setBounds(150, 120, 120, 20);
        kilometersTextField.setHorizontalAlignment(SwingConstants.RIGHT);

        JLabel resultLabel = new JLabel("litres/ 100km:");
        resultLabel.setFont(resultLabel.getFont().deriveFont(24));
        resultLabel.setBounds(30, 160, 130, 20);

        resultText = new JLabel("...");
        resultText.setFont(resultLabel.getFont().deriveFont(24));
        resultText.setBounds(150, 160, 130, 20);
        resultText.setHorizontalAlignment(SwingConstants.CENTER);


        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(30, 200, 100, 30);
        resetButton.addActionListener(controller);
        resetButton.setActionCommand("reset");

        JButton resultButton = new JButton("Calculate");
        resultButton.setBounds(170, 200, 100, 30);
        resultButton.addActionListener(controller);
        resultButton.setActionCommand("calculate");



        frame.add(nameLabel);
        frame.add(litresLabel);
        frame.add(litresTextField);
        frame.add(kilometersLabel);
        frame.add(kilometersTextField);
        frame.add(resultLabel);
        frame.add(resultText);
        frame.add(resetButton);
        frame.add(resultButton);
        frame.setVisible(true);
    }

    public void update(String litres, String kilometers){
        litresTextField.setText(litres);
        kilometersTextField.setText(kilometers);
        resultText.setText("...");
    }
    public void update(String result){
        resultText.setText(result);

    }
}

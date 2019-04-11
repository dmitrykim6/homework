package Password;

import java.awt.event.WindowEvent;

public class Model {
    Viewer viewer;

    Model(Viewer viewer){
        this.viewer = viewer;
    }

    void doAction(String value){
        String login = viewer.loginField.getText();
        char[] password = viewer.passField.getPassword();
        String strPass = new String(password);

        if(login.equals("user") && strPass.equals("123")){
            System.out.println("OK!");
//            viewer.frame.dispatchEvent(new WindowEvent(viewer.frame, WindowEvent.WINDOW_CLOSING));
            viewer.errFrame.setTitle("Good!");
            viewer.errMsg.setText("Cool...");
            viewer.errFrame.setVisible(true);
        }else{
            viewer.errMsg.setText("Wrong!");
            viewer.errFrame.setVisible(true);
        }

        if(value.equals("errOk")){
            viewer.errFrame.setVisible(false);
        }

    }
}

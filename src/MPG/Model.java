package MPG;


import javax.swing.text.View;

class Model {
    Viewer viewer;
    String type = "LPK";
    String toResult = "";
    String kilometers = "";
    String litres = "";
    String showResult = "";


    Model(Viewer viewer){
        this.viewer = viewer;
    }

    public void doAction(String value){
        if(value.equals("reset")){
            System.out.println("reset");
            kilometers = "";
            litres = "";
            viewer.update(kilometers, litres);
            return;
        }else if(value.equals("calculate")){
            System.out.println("calculate");
            kilometers = viewer.kilometersTextField.getText();
            litres = viewer.litresTextField.getText();

            Calculate(kilometers, litres);


        }

    }

    public void Calculate(String km, String lt){
        double answer = 0.0;
        double fielDouble = Double.parseDouble(lt);
        double distanceDouble = Double.parseDouble(km);
        answer = fielDouble / distanceDouble * 100;
        answer = Math.round(answer * 100.0) / 100.0;

        showResult = String.valueOf(answer);

        viewer.update(showResult);
        }


}

package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private JFXTextField display;
    int n1, n2;
    int symbol;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        n1 = n2 = 0;
        symbol = 0;

    }

    public void onDigitPressed(ActionEvent e) {
        String s = ((JFXButton)e.getSource()).getText();
        display.setText(display.getText() + s);
    }

    public void onAddPressed(ActionEvent actionEvent) {
        String numtext = display.getText();
        int num = Integer.parseInt(numtext);
        n1 = num;
        symbol = 1;
        display.setText("");
    }

    public void onSubstracionPressed(ActionEvent actionEvent) {
        String numtext = display.getText();
        int num = Integer.parseInt(numtext);
        n1 = num;
        symbol = 2;
        display.setText("");
    }

    public void onMultiplicationPressed(ActionEvent actionEvent) {
        String numtext = display.getText();
        int num = Integer.parseInt(numtext);
        n1 = num;
        symbol = 3;
        display.setText("");
    }

    public void onClearPressed(ActionEvent actionEvent) {
        display.setText("");
    }

    public void onDivisionPressed(ActionEvent actionEvent) {
        String numtext = display.getText();
        int num = Integer.parseInt(numtext);
        n1 = num;
        symbol = 4;
        display.setText("");
    }

    public void onEqualsPressed(ActionEvent actionEvent) {
        n2 = Integer.parseInt(display.getText());
        double ans = 0;
        switch (symbol){
            case 1:
                ans = n1 + n2 +0.0 ;
                break;
            case 2:
                ans = n1 - n2 +0.0;
                break;
            case 3:
                ans = n1*n2*1.0;
                break;
            case 4:
                ans = n1*1.0/n2;
                break;
        }
        display.setText(Double.toString(ans));
        symbol = 0;
    }

}

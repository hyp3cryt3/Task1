package com.example.task0;

import com.example.task0.model.calculator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label text1;
    @FXML
    private Label text2;
    @FXML
    private Label text3;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button submitButton;
    @FXML
    private TextField textField1;

    public calculator calc = new calculator();

    @FXML
    private void Click3()
    {
        double num;
        double percent = 3;

        num = calc.setNumber(Double.parseDouble(textField1.getText()));
        text1.setText(String.valueOf(calc.calc(num,percent)));
    }
    @FXML
    private void Click10()
    {
        double num;
        double percent = 10;

        num = calc.setNumber(Double.parseDouble(textField1.getText()));
        text2.setText(String.valueOf(calc.calc(num,percent)));
    }
    @FXML
    private void Click15()
    {
        double num;
        double percent = 15;

        num = calc.setNumber(Double.parseDouble(textField1.getText()));
        text3.setText(String.valueOf(calc.calc(num,percent)));
    }
}
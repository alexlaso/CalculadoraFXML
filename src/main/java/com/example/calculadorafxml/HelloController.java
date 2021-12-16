package com.example.calculadorafxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    private float num1, num2;
    private String operador;
    @FXML
    private Label textoaqui;

    @FXML
    protected void manejaBoton(ActionEvent e){
        textoaqui.setText(textoaqui.getText()+((Button)e.getSource()).getText());
    }

    @FXML
    protected void manejaBotonOp(ActionEvent e){
            num1=(Float.parseFloat(textoaqui.getText()));
            operador=(((Button)e.getSource()).getText());
            textoaqui.setText("");
    }

    @FXML
    protected void manejaBotonIgual(){
        num2=(Float.parseFloat(textoaqui.getText()));
        textoaqui.setText(String.valueOf(calcular()));
    }

    @FXML
    protected void manejaBotonC(){textoaqui.setText("0");
    }
    public float calcular(){
        switch (operador){
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case"/":
                return num1/num2;
            case"*":
                return num1*num2;
            default:
                return 0;
        }
    }
}
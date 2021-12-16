package com.example.calculadorafxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label textoaqui;
    private Model model = new Model();

    @FXML
    protected void manejaBoton(ActionEvent e){
        textoaqui.setText(textoaqui.getText()+((Button)e.getSource()).getText());
    }

    @FXML
    protected void manejaBotonOp(ActionEvent e){
        if (((Button)e.getSource()).getText()=="="){
            model.setNum2(Float.parseFloat(textoaqui.getText()));
            textoaqui.setText(String.valueOf(model.calcular()));
            System.out.println("hgf");
        }else{
            model.setNum1(Float.parseFloat(textoaqui.getText()));
            model.setOperador(((Button)e.getSource()).getText());
            textoaqui.setText("");
            System.out.println("hgf");
        }

    }

    @FXML
    protected void manejaBotonC(){textoaqui.setText("0");
    }
}
package ies.losmontecillos.componentes_shanshangfeng;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class CampoTextoBoton extends HBox {
    @FXML
    private TextField textField;
    @FXML
    private Button button;

    public CampoTextoBoton() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CampoTextoBoton.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException("Error al cargar el archivo FXML de CampoTextoBoton", e);
        }
    }

    public String getText() {
        return textField.getText();
    }

    public void setText(String text) {
        textField.setText(text);
    }

    public void setOnButtonAction(javafx.event.EventHandler<javafx.event.ActionEvent> handler) {
        button.setOnAction(handler);
    }
    @FXML
    protected void doSomething() {
        System.out.println("Texto : " + getText());
    }
}
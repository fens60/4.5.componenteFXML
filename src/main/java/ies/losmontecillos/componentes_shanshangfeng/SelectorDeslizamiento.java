package ies.losmontecillos.componentes_shanshangfeng;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectorDeslizamiento extends HBox {
    @FXML
    private Label label;
    @FXML
    private Button buttonLeft;
    @FXML
    private Button buttonRight;

    public SelectorDeslizamiento() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SelectorDeslizamiento.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //configura el título del selector
    public void setTitle(String title) {
        label.setText(title);
    }

    public Button getBtnLeft() {
        return buttonLeft;
    }

    public Button getBtnRight() {
        return buttonRight;
    }


    public static class AppUsoTextoBoton extends Application {
        @Override
        public void start(Stage stage) throws Exception {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setTitle("App Uso CampoTextoBoton");
            stage.setScene(scene);
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }

    public static class AppUsoTextoBotonController {

        @FXML
        private CampoTextoBoton campoTextoBotonNombre;

        @FXML
        private CampoTextoBoton campoTextoBotonApellido;

        @FXML
        private Label labelResultado;

        @FXML
        private void initialize() {
            //configurar acción para el CampoTextoBoton de Nombre
            campoTextoBotonNombre.setOnButtonAction(event -> {
                String textoNombre = campoTextoBotonNombre.getText();
                labelResultado.setText("Nombre guardado: " + textoNombre);
            });

            //configurar acción para el CampoTextoBoton de Apellido
            campoTextoBotonApellido.setOnButtonAction(event -> {
                String textoApellido = campoTextoBotonApellido.getText();
                labelResultado.setText("Apellido guardado: " + textoApellido);
            });

        }
    }
}

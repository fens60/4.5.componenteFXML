package ies.losmontecillos.componentes_shanshangfeng;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Temporizador temporizador;

    @FXML
    private void initialize() {
        System.out.println("Temporizador inicializado correctamente.");
    }
}
package ies.losmontecillos.componentes_shanshangfeng;

import javafx.application.Application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UsoTempo extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crear una instancia del Temporizador
        Temporizador temporizador = new Temporizador();

        // Configurar la escena
        Scene scene = new Scene(temporizador, 300, 200); // Tamaño de la ventana
        primaryStage.setTitle("Temporizador JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Iniciar la aplicación
    }
}

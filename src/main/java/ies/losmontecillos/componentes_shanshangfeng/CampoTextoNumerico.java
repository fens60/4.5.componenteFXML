package ies.losmontecillos.componentes_shanshangfeng;


import javafx.scene.control.TextField;

public class CampoTextoNumerico extends TextField {

    public CampoTextoNumerico() {
        // FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CampoTextoNumerico.fxml"));


        super();
        this.textProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue.matches("\\d*")){
                setText(oldValue);
            }
        });
    }

/*
    @Override
    public void replaceText(int start, int end, String text) {
        if (text.matches("[0-9]*")) {
            super.replaceText(start, end, text);
        }
    }

    @Override
    public void replaceSelection(String text) {
        if (text.matches("[0-9]*")) {
            super.replaceSelection(text);
        }
    }
*/
}

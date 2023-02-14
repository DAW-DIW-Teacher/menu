package com.profesor.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuController implements Initializable {

    @FXML
    private VBox subMenuAdministracion;

    @FXML
    private VBox subMenuInformes;

    @FXML
    void handlerBtnAdministracion(ActionEvent event) {
        subMenuAdministracion.setVisible(!subMenuAdministracion.isVisible());
        subMenuAdministracion.setManaged(!subMenuAdministracion.isManaged());

    }

    @FXML
    void handlerBtnInformes(ActionEvent event) {
        subMenuInformes.setVisible(!subMenuInformes.isVisible());
        subMenuInformes.setManaged(!subMenuInformes.isManaged());

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        subMenuAdministracion.setVisible(false);
        subMenuAdministracion.setManaged(false);
        subMenuInformes.setVisible(false);
        subMenuInformes.setManaged(false);
    }
}

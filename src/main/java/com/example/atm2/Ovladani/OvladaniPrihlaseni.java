package com.example.atm2.Ovladani;

import com.example.atm2.Modely.Modely;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class OvladaniPrihlaseni implements Initializable {
    public ChoiceBox ucet_volba;
    public Label bankovni_adresa_label;
    public TextField bankovni_adresa_pole;
    public TextField heslo_pole;
    public Button prihlaseni_button;
    public Button registrace_button;
    public Label error_label;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        prihlaseni_button.setOnAction(event -> Modely.getInstance().getNahled().showKlientOkno());
    }
}

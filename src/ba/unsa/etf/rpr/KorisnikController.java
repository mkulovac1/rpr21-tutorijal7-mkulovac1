package ba.unsa.etf.rpr;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class KorisnikController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
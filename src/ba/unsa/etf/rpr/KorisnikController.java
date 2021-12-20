package ba.unsa.etf.rpr;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class KorisnikController {

    public TextField fldIme;
    public TextField fldPrezime;
    public TextField fldMail;
    public TextField fldUsername;
    public PasswordField fldLozinka;
    public ListView lista;

    private KorisnikModel model;

    public KorisnikController(KorisnikModel m) {
        model = m;
    }

    @FXML
    public void initialize() {
        lista.setItems(model.getKorisnici());
        lista.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                model.setTrenutniKorisnik((Korisnik)lista.getSelectionModel().getSelectedItem());
            }
        });

        model.trenutniKorisnikProperty().addListener((obs, stariKorisnik, noviKorisnik) -> {
            if(stariKorisnik != null) {
                fldIme.textProperty().unbindBidirectional(stariKorisnik.imeProperty());
                fldPrezime.textProperty().unbindBidirectional(stariKorisnik.prezimeProperty());
                fldMail.textProperty().unbindBidirectional(stariKorisnik.emailProperty());
                fldUsername.textProperty().unbindBidirectional(stariKorisnik.korisnickoImeProperty());
                fldLozinka.textProperty().unbindBidirectional(stariKorisnik.lozinkaProperty());
            }
            if(noviKorisnik == null) {
                fldIme.setText("");
                fldPrezime.setText("");
                fldMail.setText("");
                fldUsername.setText("");
                fldLozinka.setText("");
            }
            else {
                fldIme.textProperty().bindBidirectional(noviKorisnik.imeProperty());
                fldPrezime.textProperty().bindBidirectional(noviKorisnik.prezimeProperty());
                fldMail.textProperty().bindBidirectional(noviKorisnik.emailProperty());
                fldUsername.textProperty().bindBidirectional(noviKorisnik.korisnickoImeProperty());
                fldLozinka.textProperty().bindBidirectional(noviKorisnik.lozinkaProperty());
            }
        });
    }


    public void actionKraj(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void actionDodaj(ActionEvent actionEvent) {
        Korisnik k = new Korisnik();
        lista.getItems().add(k);
        model.setTrenutniKorisnik(k);
    }
}
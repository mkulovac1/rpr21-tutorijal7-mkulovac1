package ba.unsa.etf.rpr;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.Start;

import java.io.IOException;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;
import static org.junit.jupiter.api.Assertions.*;

class KorisnikModelTest {

    @BeforeEach
    @Start
    public void start(Stage stage) throws IOException {
        KorisnikModel model = new KorisnikModel();
        model.napuni();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/korisnik.fxml"));
        loader.setController(new KorisnikController(model));
        Parent root = loader.load();
        stage.setTitle("Korisnici");
        stage.setScene(new Scene(root, USE_COMPUTED_SIZE , USE_COMPUTED_SIZE));
        stage.setMinWidth(600);
        stage.setMinHeight(400);
        stage.show();
    }



    @Test
    void getKorisnici() {

    }

    @Test
    void setKorisnici() {

    }

    @Test
    void getTrenutniKorisnik() {

    }

    @Test
    void trenutniKorisnikProperty() {

    }

    @Test
    void setTrenutniKorisnik() {

    }

    @Test
    void napuni() {

    }
}
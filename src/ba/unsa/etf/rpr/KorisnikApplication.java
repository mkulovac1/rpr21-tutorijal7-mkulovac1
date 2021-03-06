package ba.unsa.etf.rpr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;

public class KorisnikApplication extends Application {
    @Override
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

    public static void main(String[] args) {
        launch();
    }
}
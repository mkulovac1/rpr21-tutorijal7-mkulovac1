package ba.unsa.etf.rpr;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisnikModel {
    private ObservableList<Korisnik> korisnici = FXCollections.observableArrayList();
    private SimpleObjectProperty<Korisnik> trenutniKorisnik = new SimpleObjectProperty<>();

    public ObservableList<Korisnik> getKorisnici() {
        return korisnici;
    }

    public void setKorisnici(ObservableList<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public Korisnik getTrenutniKorisnik() {
        return trenutniKorisnik.get();
    }

    public SimpleObjectProperty<Korisnik> trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    public void setTrenutniKorisnik(Korisnik trenutniKorisnik) {
        this.trenutniKorisnik.set(trenutniKorisnik);
    }

    public void napuni() {
        korisnici.add(new Korisnik("Mujo", "Mujic", "mujomujic@gmail.com", "mmujic", "12345"));
        korisnici.add(new Korisnik("Fata", "Fatic", "fatafatic@hotmail.com", "ffatic1", "111aaaw"));
        korisnici.add(new Korisnik("Suljo", "Suljic", "ssuljic1@etf.unsa.ba", "ssuljic2", "lozinka"));
        korisnici.add(new Korisnik("Ana", "Anic", "aanic1@etf.unsa.ba", "aanic1", "password"));
        trenutniKorisnik.set(null);
    }
}

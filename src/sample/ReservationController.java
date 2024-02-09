package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import models.Reservation;

public class ReservationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private TableView<Reservation> reservation_table;

    @FXML
    private TableColumn<Reservation, String> action;

    @FXML
    private TableColumn<Reservation, String> agency_name;

    @FXML
    private TableColumn<Reservation, Integer> id_reservation;

    @FXML
    private TableColumn<Reservation, Integer> id_trip;

    @FXML
    private TableColumn<Reservation, ?> nb_seat;

    @FXML
    private TableColumn<Reservation, ?> price;

    @FXML
    private TableColumn<Reservation, ?> reservation_date;

    @FXML
    private TableColumn<Reservation, ?> status;

    @FXML
    void initialize() {
        assert action != null : "fx:id=\"action\" was not injected: check your FXML file 'sample.fxml'.";
        assert agency_name != null : "fx:id=\"agency_name\" was not injected: check your FXML file 'sample.fxml'.";
        assert id_reservation != null : "fx:id=\"id_reservation\" was not injected: check your FXML file 'sample.fxml'.";
        assert id_trip != null : "fx:id=\"id_trip\" was not injected: check your FXML file 'sample.fxml'.";
        assert nb_seat != null : "fx:id=\"nb_seat\" was not injected: check your FXML file 'sample.fxml'.";
        assert price != null : "fx:id=\"price\" was not injected: check your FXML file 'sample.fxml'.";
        assert reservation_date != null : "fx:id=\"reservation_date\" was not injected: check your FXML file 'sample.fxml'.";
        assert status != null : "fx:id=\"status\" was not injected: check your FXML file 'sample.fxml'.";

    }

}

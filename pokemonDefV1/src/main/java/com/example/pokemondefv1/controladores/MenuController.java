package com.example.pokemondefv1.controladores;

import com.example.pokemondefv1.MainMenu;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

//
public class MenuController implements Initializable {

    @FXML
    private TextField mSecsRonda;

    @FXML
    private TextField numJugadores;

    @FXML
    private TextField numNPCS;

    @FXML
    private Spinner<Integer> numPokeSpinner;

    @FXML
    private Button readMe;

    @FXML
    private Button startButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        numJugadores.setText("1");

        numNPCS.setText("1");

        mSecsRonda.setText("2000");

        SpinnerValueFactory<Integer> svf = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 1);
        svf.setValue(1);
        numPokeSpinner.setValueFactory(svf);
    }
    //onAction="#onReadMeButtonClick"
}
    /*
    //@FXML
   // protected void onReadMeButtonClick(){MainMenu.launch();}

    @FXML
    void startGame(MouseEvent event) {
        /*try {
            FXMLLoader fxmlLoader = new FXMLLoader(com.example.pokemondefv1.CampoBatalla.class.getResource("CampoBatalla.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage= new Stage();
            stage.setTitle("Campo de Batalla");
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


        /*@FXML
        private Button startButton;

        @FXML
        void startGame(ActionEvent event) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(com.example.pokemondefv1.CampoBatalla.class.getResource("CampoBatalla.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 600, 400);
                stage.setTitle("Campo de Batalla");
                stage.setScene(scene);
                stage.show();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
        startButton.setOnMouseClicked();
        }
    }
    protected void onStartButtonClick(Stage stage){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(com.example.pokemondefv1.CampoBatalla.class.getResource("CampoBatalla.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            stage.setTitle("Campo de Batalla");
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
   }
}*/

module com.example.pokemondefv1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pokemondefv1 to javafx.fxml;
    exports com.example.pokemondefv1;
}
module br.com.amosrodrigues {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.amosrodrigues to javafx.fxml;
    exports br.com.amosrodrigues;
}

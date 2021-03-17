module borrowing.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires opencsv;

    opens borrowing.demo to javafx.fxml;
    exports borrowing.demo;
}
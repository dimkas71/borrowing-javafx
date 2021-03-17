module borrowing.demo {
    requires javafx.controls;
    requires javafx.fxml;

    opens borrowing.demo to javafx.fxml;
    exports borrowing.demo;
}
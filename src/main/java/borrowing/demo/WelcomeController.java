package borrowing.demo;

import java.io.IOException;
import javafx.fxml.FXML;

public class WelcomeController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("map");
    }
}

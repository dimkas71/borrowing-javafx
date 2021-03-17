package borrowing.demo;

import java.io.IOException;
import javafx.fxml.FXML;

public class MapController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("welcome");
    }
}
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class PrincipalController implements Initializable {

    @FXML
    private Circle circle; // Variable que representa al círculo con el ID "circle" en el archivo FXML

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        Image img = new Image("../images/logo.jpeg");
        circle.setFill(new ImagePattern(img));
    }    
}

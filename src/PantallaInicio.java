import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PantallaInicio extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ImaginaryEnglish");
        Parent parent = FXMLLoader.load(getClass().getResource("principal.fxml"));
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.show();
        Parent PantallaNivel1 = FXMLLoader.load(getClass().getResource("PartidaLvL2.fxml"));
        Scene Scena = new Scene(PantallaNivel1);
        primaryStage.setScene(Scena);
        primaryStage.show();
        Parent PantallaDerrota = FXMLLoader.load(getClass().getResource("PantallaVictoria.fxml"));
        Scene Derrota = new Scene(PantallaDerrota);
        primaryStage.setScene(Derrota);
        primaryStage.show();
    
    }

    
}
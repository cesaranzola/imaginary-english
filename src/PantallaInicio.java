import java.util.Scanner;
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
        
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una pantalla: \n" +
                "1 derrota\n" +
                "2 victoria\n" +
                "3 lvl1\n" +
                "4 lvl2\n" +
                "5 lvl3\n"
                + "6 principal\n");
        int opcion = scanner.nextInt();
        
        scanner.nextLine(); // Limpiar el buffer de entrada

        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la opción 'derrota'");
                Parent PantallaDerrota = FXMLLoader.load(getClass().getResource("/views/PantallaDerrota.fxml"));
                Scene Derrota = new Scene(PantallaDerrota);
                primaryStage.setScene(Derrota);
                primaryStage.show();
                break;
                
            case 2:
                System.out.println("Has seleccionado la opción 'victoria'");
                Parent PantallaVictoria = FXMLLoader.load(getClass().getResource("/views/PantallaVictoria.fxml"));
                Scene Victoria = new Scene(PantallaVictoria);
                primaryStage.setScene(Victoria);
                primaryStage.show();
                break;
            case 3:
                System.out.println("Has seleccionado la opción 'lvl1'");
                Parent PantallaNivel1 = FXMLLoader.load(getClass().getResource("/views/PartidaLvL1.fxml"));
                Scene lvl1 = new Scene(PantallaNivel1);
                primaryStage.setScene(lvl1);
                primaryStage.show();
                break;
            case 4:
                System.out.println("Has seleccionado la opción 'lvl2'");
                Parent PantallaNivel2 = FXMLLoader.load(getClass().getResource("/views/PartidaLvL2.fxml"));
                Scene lvl2 = new Scene(PantallaNivel2);
                primaryStage.setScene(lvl2);
                primaryStage.show();
                break;
            case 5:
                System.out.println("Has seleccionado la opción 'lvl3'");
                Parent PantallaNivel3 = FXMLLoader.load(getClass().getResource("/views/PartidaLvL3.fxml"));
                Scene lvl3 = new Scene(PantallaNivel3);
                primaryStage.setScene(lvl3);
                primaryStage.show();
                break;
            case 6:
                System.out.println("Has seleccionado la opción 'principal'");
                primaryStage.setTitle("ImaginaryEnglish");
                Parent parent = FXMLLoader.load(getClass().getResource("/views/principal.fxml"));
                Scene scene = new Scene(parent);
                primaryStage.setScene(scene);
                primaryStage.show();
                break;
            default:
                System.out.println("Opción inválida");
        }

        scanner.close();
    }
            
    }

    

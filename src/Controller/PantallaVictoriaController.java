package Controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

public class PantallaVictoriaController implements Initializable {
    @FXML
    private Button button;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    Image image = new Image(getClass().getResourceAsStream("/images/home.png"));

        // Crear un ImageView y establecer la imagen en él
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(30);
        imageView.setFitHeight(30);

        // Establecer el ImageView como el gráfico del botón
        button.setGraphic(imageView);

        button.setOnAction(event -> {
            System.out.println("Hola Mundo");
        });



        
        
    }
        
        
        
    }
    


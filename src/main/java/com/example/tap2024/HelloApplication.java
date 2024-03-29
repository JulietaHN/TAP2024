package com.example.tap2024;

import com.example.tap2024.vistas.Calculadora;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class HelloApplication extends Application {
    private MenuBar mnbPrincipal;
    private Menu menParcial1, menParcial2, menSalir;
    private MenuItem mitCalculadora, mitSalir;
    private BorderPane bdpPanel;



    @Override
    public void start(Stage stage) throws IOException {
        CrearMenu();
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        bdpPanel = new BorderPane();
        bdpPanel.setTop(mnbPrincipal);
        Scene scene = new Scene(bdpPanel);
        scene.getStylesheets().add(getClass().getResource("/estilos/main.css").toString());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();

        //"new Calculadora();
    }

    private void CrearMenu() {
        /* Menu primer parcial */
        mitCalculadora = new MenuItem("Calculadora");
        menParcial1 = new Menu("Primer parcial");
        menParcial1.getItems().addAll(mitCalculadora);

        /* Menu segundo parcial */
        menParcial2 = new Menu("Segundo parcial");

        /* Menu salir*/
        menSalir = new Menu("Salir");
        mitSalir = new MenuItem("Salir");
        menSalir.setOnAction(event->System.exit(0));
        menSalir.getItems().addAll(mitSalir);


        mnbPrincipal = new MenuBar();
        mnbPrincipal.getMenus().addAll(menParcial1, menParcial2, menSalir);
    }

    public static void main(String[] args) {
        launch();
    }
}
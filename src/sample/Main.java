package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {

    Scene client;
    Scene registrartion;
    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("client.fxml"));
        primaryStage.setTitle("Home Chat");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() { //при закрытие окна, программа закрывается, но мы это сделали через демона
            @Override
            public void handle(WindowEvent event) {

            }
        });
    }


    public static void main(String[] args) {
        // метод из класса Application и нужен для определения что это javaFX
        launch(args);
    }


}
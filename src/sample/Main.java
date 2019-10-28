package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        FileInputStream input = new FileInputStream("C:/Test2/src/sample/Javafximage.jpg");
//        Image image = new Image(input);
//        ImageView imageView = new ImageView(image);
//
//        VBox box = new VBox(imageView);
//
//        primaryStage.setScene(new Scene(box, 500, 500, Color.BLACK));
//        primaryStage.show();
        primaryStage.setTitle("HBox Experiment 1");
        Button button = new Button("Button");
        Label label = new Label("My Label");
        VBox box = new VBox(label, button);

        Scene scene = new Scene(box, 300, 300);
        primaryStage.setScene(scene);


//        VBox box1 = new VBox(button);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

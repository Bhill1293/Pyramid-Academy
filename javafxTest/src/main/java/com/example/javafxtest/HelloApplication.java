package com.example.javafxtest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image icon = new Image("icon.png");
        stage.setTitle("New Horizons Airlines");
        stage.setWidth(600);
        stage.setHeight(600);
        stage.setResizable(false);
        Text text = new Text();
        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setHeight(100);
        rectangle.setWidth(100);
        rectangle.setFill(Color.ANTIQUEWHITE);
        root.getChildren().add(rectangle);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
package org.example.firstapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class HelloApplication extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        Text text = new Text("Welcome to JAVAFX");

        HBox hBox1 = new HBox();
        hBox1.setSpacing(16);
        Label l1 = new Label("First Name");
        TextField t1 = new TextField();
        hBox1.getChildren().addAll(l1, t1);

        HBox hBox2 = new HBox();
        hBox2.setSpacing(16);
        Label l2 = new Label("Last Name");
        TextField t2 = new TextField();
        hBox2.getChildren().addAll(l2, t2);

        HBox hBox3 = new HBox();
        hBox3.setSpacing(16);
        Label l3 = new Label("Age");
        TextField t3 = new TextField();
        hBox3.getChildren().addAll(l3, t3);
        t3.setAlignment(Pos.CENTER_RIGHT);

        HBox hBox4 = new HBox();
        Button btn = new Button("Check Eligible");
        hBox4.getChildren().add(btn);

        Text message = new Text();

        btn.setOnAction(e -> {
            if (Integer.parseInt(t3.getText()) >= 18) {
                message.setText("You are eligible!");
            }
            else {
                message.setText("You are not eligible!");
            }
        });


        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(30, 30, 30, 30));
        //vBox.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
        vBox.setMaxHeight(300);
        vBox.setMaxWidth(300);
        vBox.getChildren().addAll(text, hBox1, hBox2, hBox3, hBox4, message);

        StackPane stackPane = new StackPane();
        stackPane.setBackground(new Background(new BackgroundFill(Color.AQUA, CornerRadii.EMPTY, Insets.EMPTY)));
        stackPane.getChildren().add(vBox);

        Scene scene = new Scene(stackPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Welcome");
        primaryStage.show();
    }

    public static void main(String[] args) {
       launch();
    }
}
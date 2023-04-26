/*
Write a program to create a checkbox to choose one option among 
the given choices.
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Practical39 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create some CheckBox options
        Label label = new Label("What Is Your Favourite Seasons?");
        CheckBox option1 = new CheckBox("Winter");
        CheckBox option2 = new CheckBox("Summer");
        CheckBox option3 = new CheckBox("Monsoon");

        // Create a VBox layout container to hold the CheckBox options
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(label,option1, option2, option3);

        // Create a scene and add the VBox to it
        Scene scene = new Scene(vbox, 300, 200);

        // Set the scene on the primary stage and show it
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
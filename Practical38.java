//NOT YET COMPLETED!!
// import javafx.Application;
// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.BLabel;
// import javafx.scene.layout.VBox;
// import javafx.stage.stage;
// public class Practical38 extends Application {
//     public void start(Stage primaryStage){
//         Button button=new Button("Click Me!");
//         Label label=new Label("Welcome to Java Fx");
//         button.setOnAction(event->{
//             boolean isVisible=label.isVisible();
//             label.setVisible(!isVisible);
//         });
//         VBox vbox=new VBox();
//         vbox.getAlignment(Pos.CENTER);
//         vbox.getChildren().addAll(label,button);
//         Scene scene=new Scene(vbox,300,200);
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }
//     public static void main(String[] args) {
//         launch(args);
//     }
// }
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

class ButtonClickExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a button with a label
        Button button = new Button("Click me!");

        // Add an event handler for the button click event
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Welcome to JavaFX");
            }
        });

        // Create a layout pane and add the button to it
        StackPane root = new StackPane();
        root.getChildren().add(button);

        // Create a scene and add the layout pane to it
        Scene scene = new Scene(root, 300, 250);

        // Set the title of the window and show it
        primaryStage.setTitle("Button Click Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    public static int WIDTH = 640;
    public static int HEIGHT = 480;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        Label helloLabel = new Label("Hello, World");

        Label goodByeLabel = new Label("goodBye!");

        Button clickMeButton = new Button("Click me");

        Font font = Font.font("Consolas", FontWeight.BOLD, 20);

        clickMeButton.setFont(font);

        clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                System.out.println("ClickMe Button Clicked!");

                helloLabel.setText("Clicked!");
            }
        });

        //HBox hbox = new HBox(helloLabel,clickMeButton);
        //VBox vbox = new VBox(helloLabel,clickMeButton);
        GridPane gridPane = new GridPane();
        gridPane.add(helloLabel, 1,0);
        gridPane.add(goodByeLabel, 1,1);
        gridPane.add(clickMeButton, 2,2);

        Scene scene = new Scene(gridPane, WIDTH, HEIGHT);

        primaryStage.setScene(scene);

        //primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

 // a
    public static void main(String[] args) {
        launch(args);
    }
}

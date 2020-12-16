package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Main extends Application {

    public static int WIDTH = 640;
    public static int HEIGHT = 480;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");

        Label helloLabel = new Label("Character");

        //Label goodByeLabel = new Label("goodBye!");

        Label anotherLabel = new Label("Another Label");

        Label yetAnotherLabel = new Label("Yet Another Label");

        Button clickMeButton = new Button("Click me");

        Font font = Font.font("Consolas", FontWeight.BOLD, 20);
        clickMeButton.setStyle("-fx-font-family: Arial");
        //clickMeButton.setFont(font);


        FileInputStream imagePath = new FileInputStream("SRC/sample/image.jpg");
        Image image = new Image(imagePath);

        ImageView imageView = new ImageView(image);

        FileInputStream imagePath2 = new FileInputStream("SRC/sample/image2.jpg");
        Image image2 = new Image(imagePath2);

        imageView.setFitWidth(400);
        imageView.setPreserveRatio(true);

        class ButtonClickHandler implements EventHandler<ActionEvent>
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                imageView.setImage(image2);

                helloLabel.setText("New character");
            }
        }

        clickMeButton.setOnAction(new ButtonClickHandler());
        /*
        clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                imageView.setImage(image2);

                helloLabel.setText("New character");
            }
        });*/

        //HBox hbox = new HBox(helloLabel,clickMeButton);
        //VBox vbox = new VBox(helloLabel,clickMeButton);
        HBox hbox = new HBox(10, helloLabel);
        //hbox.setStyle("-fx-alignment: center; -fx-font-size: 20px;");


        HBox hbox2 = new HBox(10, imageView);


        GridPane gridPane = new GridPane();

        gridPane.setMinSize(6,8);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(10));

        gridPane.add(hbox, 0,0);
        gridPane.add(hbox2, 0,1);
        gridPane.add(clickMeButton, 2,2);

        //gridPane.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        gridPane.setStyle("-fx-border-color: black; -fx-font-size: 20; -fx-font-family: Consolas;");
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

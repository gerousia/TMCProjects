package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {
    @Override
    public void start(Stage windows) {

        BorderPane firstBorderPane = new BorderPane();
        firstBorderPane.setTop(new Label("First View"));
        Button firstButton = new Button("To second view");
        firstBorderPane.setCenter(firstButton);
        Scene firstScene = new Scene(firstBorderPane, 300, 300);

        VBox secVBox = new VBox();
        Button secondButton = new Button("To the third view");
        Label secondLabel = new Label("Second view");
        secVBox.getChildren().addAll(secondButton, secondLabel);
        Scene secondScene = new Scene(secVBox, 300, 300);

        GridPane gPane = new GridPane();
        Button thirdButton = new Button("To the first view");
        Label thirdLabel = new Label("Third view");
        gPane.add(thirdLabel, 0, 0);
        gPane.add(thirdButton, 1, 1);
        Scene thirdScene = new Scene(gPane, 300, 300);

        firstButton.setOnAction((event) -> {
            windows.setScene(secondScene);
        });

        secondButton.setOnAction((event) -> {
            windows.setScene(thirdScene);
        });

        thirdButton.setOnAction((event) -> {
            windows.setScene(firstScene);
        });

        windows.setScene(firstScene);
        windows.show();

    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
}
package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;

public class TextStatisticsApplication extends Application {


    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        TextArea textArea = new TextArea("");
        layout.setCenter(textArea);

        HBox texts = new HBox();
        texts.setSpacing(10);

        Label labelLetters = new Label("Letters: 0");
        Label labelWord = new Label("Words: 0");
        Label labelLongestWord = new Label("The longest word is: ");

        texts.getChildren().add(labelLetters);
        texts.getChildren().add(labelWord);
        texts.getChildren().add(labelLongestWord);
        layout.setBottom(texts);

        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            labelLetters.setText("Letters: " + characters);
            labelWord.setText("Words: " + words);
            labelLongestWord.setText("The longest word is: " + longest);
        });
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}
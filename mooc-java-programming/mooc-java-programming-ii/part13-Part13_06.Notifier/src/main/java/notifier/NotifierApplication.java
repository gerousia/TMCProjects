package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {
    @Override
    public void start(Stage window) {
        VBox componentGroup = new VBox();

        TextField textField = new TextField("");
        Button button = new Button("Update");
        Label label = new Label();

        componentGroup.getChildren().add(textField);
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(label);

        Scene scene = new Scene(componentGroup);

        button.setOnAction((event) -> {
            label.setText(textField.getText());
        });

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }
}

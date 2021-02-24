package ui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    //TODO zet naast uw project sdk ook de project language level op 8, anders kan je niet builden (project structure -> project)

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Coding");

        FlowPane root = new FlowPane();
        root.setAlignment(Pos.BASELINE_CENTER);
        root.setVgap(5);
        root.setHgap(5);

        //TODO bij labels creëren: neem bv Button van java.scene.control ; java.awt Button bestaat ook maar java.awt
        //TODO is een outdated library die niet werkt in fx
        Label codeLabel = new Label("Geheimschrift:");
        TextField textField = new TextField();
        Button code = new Button("code");


        root.getChildren().add(codeLabel);
        root.getChildren().add(textField);
        root.getChildren().add(code);

        Scene mainScene = new Scene(root, 350, 40);
        primaryStage.setScene(mainScene);

        primaryStage.show();
    }
}

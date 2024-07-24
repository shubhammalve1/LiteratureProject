package com.literature.Pages;

import com.literature.Controller.Controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Page1 {

    private Controller app;
    private StackPane view;

    public Page1(Controller controller) {
       this.app = controller;
       initialize();
    }

    private void initialize() {
        view = new StackPane();
        view.setPadding(new Insets(20));
        view.setAlignment(Pos.CENTER);

        System.out.println("In Page 1");

        Button nextButton = new Button("Next");
        nextButton.setAlignment(Pos.CENTER);
        nextButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                app.navigateToPage2();
            }
        });

        VBox vbPage1 = new VBox(nextButton);
        vbPage1.setAlignment(Pos.CENTER);
        vbPage1.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));


        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(vbPage1);

        view.getChildren().addAll(borderPane);

        
    }

    public Parent getView() {
        return view;
    }
    
}

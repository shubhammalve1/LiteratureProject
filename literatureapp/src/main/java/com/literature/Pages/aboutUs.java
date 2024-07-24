package com.literature.Pages;

import com.literature.Controller.Controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class aboutUs {
    private Controller app;
    private StackPane view;

    public aboutUs(Controller controller) {
        this.app = controller;
        initialize();
    }

    private void initialize() {
        view = new StackPane();
        view.setPadding(new Insets(20));
        view.setAlignment(Pos.CENTER);

        System.out.println("In Page About Us");

        Label lbaboutUs = new Label("About Us");

        Button backButtonaboutUs = new Button("Back");
        backButtonaboutUs.setAlignment(Pos.BOTTOM_LEFT);

        backButtonaboutUs.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                app.navigateToPage2();
            }
        });

        HBox hbaboutUs = new HBox(lbaboutUs);
        //hbaboutUs.setAlignment(Pos._LEFT);
        hbaboutUs.setPadding(new Insets(10));
        hbaboutUs.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        VBox vbaboutUs = new VBox(backButtonaboutUs);
        vbaboutUs.setAlignment(Pos.BOTTOM_LEFT);
        vbaboutUs.setPadding(new Insets(10));
        vbaboutUs.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        BorderPane borderPaneaboutUs = new BorderPane();
        borderPaneaboutUs.setTop(hbaboutUs);
        borderPaneaboutUs.setCenter(vbaboutUs);

        view.getChildren().add(borderPaneaboutUs); 
    }

    public Parent getView() {
        return view;
    }





    
}

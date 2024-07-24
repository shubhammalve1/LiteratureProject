package com.literature.Pages;

import com.literature.Controller.Controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class Write {
    private Controller app;
    private StackPane view;

    public Write(Controller controller) {
        this.app = controller;
        initialize();
        
    }

    private void initialize() {
        view = new StackPane();
        view.setPadding(new Insets(20));
        view.setAlignment(Pos.CENTER);
        
        //Label
        Label lbWrite = new Label("Write Here");
        
        //Back Button : Return to Page2
        Button backWrite = new Button("Back");
        backWrite.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                app.navigateToPage2();
            }

        });

        StackPane spWrite = new StackPane(lbWrite,backWrite);
        spWrite.setAlignment(Pos.CENTER);

        view.getChildren().add(spWrite);   
    }

    public Parent getView() {
        return view;
    }
    
}

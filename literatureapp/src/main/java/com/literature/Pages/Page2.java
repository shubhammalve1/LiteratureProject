package com.literature.Pages;

import com.literature.Controller.Controller;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
//import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Page2 {
    private Controller app;
    private StackPane view;

    public Page2(Controller controller) {
        this.app = controller;
        initialize();
    }

    private void initialize() {
        view = new StackPane();
        view.setPadding(new Insets(20));
        view.setAlignment(Pos.CENTER);
        
        //Back Button
        Button backButton = new Button("Back");
        backButton.setAlignment(Pos.TOP_LEFT);

        //Action on Back Button
        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                app.navigateToPage1();
            }
        });

        HBox hbPage2 = new HBox(backButton);
        hbPage2.setAlignment(Pos.TOP_LEFT);

        //Write Button
        Button write = new Button("Write");
        //Write Button Action 
        write.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                app.navigateToWrite();
            }
            
        });

        //AboutUs Button 
        Button aboutUsPage2 = new Button("About Us");
        //About Us Button Action
        aboutUsPage2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                app.navigateToaboutUs();
            }
        });

        // Profile Image
        Image imgPage2 = new Image("file:literatureapp/src/main/resources/profileimage.jpg");
        ImageView imgViewPage2 = new ImageView(imgPage2);

        // Set the width of the image
        imgViewPage2.setFitWidth(50);  
        // Set the height of the image
        imgViewPage2.setFitHeight(50); 

        // Profile Button
        Button profileButtonPage2 = new Button();
        profileButtonPage2.setGraphic(imgViewPage2);
        profileButtonPage2.setStyle("-fx-background-color: transparent;");

        //Action on profile Button 
        profileButtonPage2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                app.navigateToPage1();
            }
        });

        //HBox containing About Write, Us Button, Profile Button 
        HBox hbProfile = new HBox(hbPage2, write, aboutUsPage2, profileButtonPage2);
        hbProfile.setAlignment(Pos.TOP_RIGHT);
        hbProfile.setPadding(new Insets(10));
        hbProfile.setSpacing(10);
        hbProfile.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

         //Label 
         Label lbPage2 = new Label("Welcome Shubham");
         lbPage2.setAlignment(Pos.TOP_LEFT);
         lbPage2.setPadding(new Insets(10));

         VBox vb3Page2 = new VBox(lbPage2);
         vb3Page2.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        System.out.println("In Page 2");

        VBox vbcontent = new VBox();
        vbcontent.setAlignment(Pos.CENTER_LEFT);
        vbcontent.setPrefHeight(200); // Set preferred height to make it visible
        vbcontent.setPadding(new Insets(10));
        vbcontent.setBackground(new Background(new BackgroundFill(Color.BEIGE, CornerRadii.EMPTY, Insets.EMPTY)));

        VBox vbPage2 = new VBox(hbProfile,vb3Page2,vbcontent);
        vbPage2.setSpacing(10);
        

        StackPane stackPane = new StackPane(vbPage2);

        view.getChildren().add(stackPane);
    }

    public Parent getView() {
        return view;
    }
}





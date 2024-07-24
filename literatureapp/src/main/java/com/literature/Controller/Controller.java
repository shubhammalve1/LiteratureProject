package com.literature.Controller;

import com.literature.Pages.Page1;
import com.literature.Pages.Page2;
import com.literature.Pages.Write;
import com.literature.Pages.aboutUs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller extends Application {
    private Stage primaryStage;
    private Scene page1Scene, page2Scene, writeScene, aboutUsScene;

    //Page1 Page2 Instance
    private Page1 page1;
    private Page2 page2;
    private Write write;
    private aboutUs aboutus;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
       this.primaryStage = primaryStage;

       //Initialize pages
       page1 = new Page1(this);
       page2 = new Page2(this);
       write = new Write(this);
       aboutus = new aboutUs(this);

       //Create scenes for each page with specific dimension
       page1Scene = new Scene(page1.getView(), 500, 500);
       page2Scene = new Scene(page2.getView(), 500, 500);
       writeScene = new Scene(write.getView(), 500, 500);
       aboutUsScene = new Scene(aboutus.getView(), 500, 500);


       primaryStage.setScene(page1Scene);
       primaryStage.setTitle("Literature");
       primaryStage.show();
    }

    public void navigateToPage1() {
        boolean isMaximized = primaryStage.isMaximized();
        primaryStage.setScene(page1Scene);
        primaryStage.setMaximized(isMaximized);

    }

    public void navigateToPage2() {
        boolean isMaximized = primaryStage.isMaximized();
        primaryStage.setScene(page2Scene);
        primaryStage.setMaximized(isMaximized);
    }

    public void navigateToWrite() {
        boolean isMaximized = primaryStage.isMaximized();
        primaryStage.setScene(writeScene);
        primaryStage.setMaximized(isMaximized);
    }

    public void navigateToaboutUs() {
        boolean isMaximized = primaryStage.isMaximized();
        primaryStage.setScene(aboutUsScene);
        primaryStage.setMaximized(isMaximized);
    }
    
}

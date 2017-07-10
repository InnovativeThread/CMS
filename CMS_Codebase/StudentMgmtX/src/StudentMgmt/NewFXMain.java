package StudentMgmt;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NewFXMain extends Application {
    
    private Stage primaryStage;
    private AnchorPane homeLayout;
    private AnchorPane loginLayout;
     FXMLLoader loader=new FXMLLoader();
     Scene scene;
    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage=primaryStage;
        this.primaryStage.setTitle("Student Management");
      
       // Parent root=FXMLLoader.load(getClass().getResource("view/LoginView.fxml"));

        showLoginView();
     //   showMainView();
    }
    
    
    public void showMainView() throws IOException
    {
        Stage newStage=new Stage();
        loader.setLocation(NewFXMain.class.getResource("view/HomeView.fxml"));
        homeLayout=loader.load();
        scene=new Scene(homeLayout);
        newStage.setScene(scene);
        newStage.show();
    }
    
    public void showLoginView() throws IOException
    {
     //   FXMLLoader loader=new FXMLLoader();
        loader.setLocation(NewFXMain.class.getResource("view/LoginView.fxml"));
        loginLayout=loader.load();
        scene=new Scene(loginLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
   
    public static void main(String[] args) {
        launch(args);
    }
    
}

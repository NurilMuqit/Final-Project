import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage stg;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stg = primaryStage;
        primaryStage.setResizable(false);
        Parent root=FXMLLoader.load(getClass().getResource("Login.fxml"));
        Image icon =new Image(getClass().getResourceAsStream("Project 3.png"));
        primaryStage.setTitle("ramen kan");
        primaryStage.getIcons().add(icon);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    public void changeScene(String fxml)throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }
        
    public static void main(String[] args) {
      
        launch(args);
    }

}
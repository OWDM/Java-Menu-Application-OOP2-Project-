package test;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author owd1
 */
public class test extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/resurce/TestFrame1.fxml"));
        Scene scene = new Scene(parent);
        
        primaryStage.setTitle("Sign up");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        launch(args);
    }
    
    
}

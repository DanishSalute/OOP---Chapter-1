import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
        
        // Set the title of the application
        primaryStage.setTitle("Calculator Basic");
        
        // Set the icon for the application (make sure the path is correct)
        Image icon = new Image(getClass().getResourceAsStream("/CalculatorIcon.png"));
        primaryStage.getIcons().add(icon);
        
        // Set the scene from the FXML and display the window
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class Main extends Application {

    // FXML elements linked via @FXML annotation
    @FXML
    private RadioButton opmButton;

    @FXML
    private RadioButton jjkButton;

    @FXML
    private RadioButton dsButton;

    @FXML
    private CheckBox maleCheckbox;

    @FXML
    private CheckBox femaleCheckbox;

    @FXML
    private TextField textField;

    private ToggleGroup radioButtonGroup;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("C:\\Users\\User\\Documents\\Java-Code\\Interface\\src\\GUI.fxml"));
        loader.setController(this); // Set this class as the controller
        Parent root = loader.load();

        // Create the scene and set it on the stage
        Scene scene = new Scene(root);
        primaryStage.setTitle("AniRewards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    public void initialize() {
        // Group radio buttons so only one can be selected at a time
        radioButtonGroup = new ToggleGroup();
        opmButton.setToggleGroup(radioButtonGroup);
        jjkButton.setToggleGroup(radioButtonGroup);
        dsButton.setToggleGroup(radioButtonGroup);

        // Set checkbox logic to ensure only one checkbox is selected
        maleCheckbox.setOnAction(e -> {
            if (maleCheckbox.isSelected()) {
                femaleCheckbox.setSelected(false);
            }
        });

        femaleCheckbox.setOnAction(e -> {
            if (femaleCheckbox.isSelected()) {
                maleCheckbox.setSelected(false);
            }
        });
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class CalculatorBasic {

    @FXML
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    @FXML
    private Button btn_Backspace, btn_Division, btn_Minus, btn_Multiplication, btn_Plus, btn_Result;

    @FXML
    private TextField text_Result;

    private int firstOperand = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    @FXML
    void numberClicked(MouseEvent event) {
        Button clickedButton = (Button) event.getSource();
        String buttonText = clickedButton.getText();

        // If starting a new number, reset the display
        if (startNewNumber) {
            text_Result.appendText(buttonText); // Append to show the number after operator
            startNewNumber = false;
        } else {
            text_Result.appendText(buttonText); // Continue appending digits to the current number
        }
    }

    @FXML
    void plusClicked(MouseEvent event) {
        handleOperator("+");
    }

    @FXML
    void minusClicked(MouseEvent event) {
        handleOperator("-");
    }

    @FXML
    void multiplyClicked(MouseEvent event) {
        handleOperator("×");  // Use multiplication symbol instead of "*"
    }

    @FXML
    void divisionClicked(MouseEvent event) {
        handleOperator("÷");  // Use division symbol instead of "/"
    }

    @FXML
    void resultClicked(MouseEvent event) {
        if (operator.isEmpty()) return;

        // Extract the second operand after the operator
        int secondOperand = Integer.parseInt(text_Result.getText().replaceFirst(".*\\s[" + operator + "]\\s", ""));
        int result = calculateResult(secondOperand);

        text_Result.setText(String.valueOf(result));  // Display final result
        operator = "";
        startNewNumber = true;
    }

    @FXML
    void backspaceClicked(MouseEvent event) {
        String currentText = text_Result.getText();
        
        // If the result button hasn't been pressed (i.e., `startNewNumber` is false)
        if (!startNewNumber) {
            if (!currentText.isEmpty()) {
                // Remove the last character from the text field
                text_Result.setText(currentText.substring(0, currentText.length() - 1));
            }
            
            // After removing all characters, if the text becomes empty, reset the state
            if (text_Result.getText().isEmpty()) {
                startNewNumber = true;
                operator = "";
                firstOperand = 0;
            }
        } else {
            // If the result button was pressed, clear everything
            text_Result.setText(null);  // Clears the entire text field
            startNewNumber = true;
            operator = "";
            firstOperand = 0;
        }
    }
    

    private void handleOperator(String newOperator) {
        // If there's no operator yet, treat the current number as the first operand
        if (operator.isEmpty()) {
            firstOperand = Integer.parseInt(text_Result.getText());
        } else {
            // If operator already exists, calculate the intermediate result
            int secondOperand = Integer.parseInt(text_Result.getText().replaceFirst(".*\\s[" + operator + "]\\s", ""));
            int result = calculateResult(secondOperand);
            firstOperand = result;
            text_Result.setText(String.valueOf(result)); // Show intermediate result
        }

        // Append the operator symbol to the current text field value
        text_Result.appendText(" " + newOperator + " ");
        operator = newOperator;
        startNewNumber = true;  // Ready for the next operand
    }

    private int calculateResult(int secondOperand) {
        int result = 0;

        switch (operator) {
            case "+" -> result = firstOperand + secondOperand;
            case "-" -> result = firstOperand - secondOperand;
            case "×" -> result = firstOperand * secondOperand;
            case "÷" -> result = secondOperand != 0 ? firstOperand / secondOperand : 0;  // Avoid division by zero
        }

        return result;
    }
}

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Celsius resultCelsius = new Celsius();
        Fahrenheit resultFahrenheit = new Fahrenheit();

        System.out.print("-----------Input the number as shown below-----------\n\t\t1. Convert Celsius\n\t\t2. Convert Fahrenheit\n\nInput Number Here : ");
        byte userInput = scan.nextByte();

        System.out.print("Input the temperature here ( decimals also counted ) : ");
        float userTemperature = scan.nextFloat();

        switch (userInput) {
            case 1:
                resultCelsius.convertCelsius(userTemperature);
                break;
            case 2:
                resultFahrenheit.convertFahrenheit(userTemperature);
                break;
            default:
                System.out.println("Input invalid");
                break;
        }
        scan.close();
    }
}
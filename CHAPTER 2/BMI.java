import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try{
        System.out.println("Enter weight in KG :");
        double weight = scan.nextDouble();
        System.out.println("Enter height in Meter :");
        double height = scan.nextDouble();
        scan.close();
        
        double bMI = weight / (height * 2);

        }
        catch(NumberFormatException as){
            System.out.println("Please input digits only");

        }
        System.out.printf("Your BMI is : " + "%.2f", bMI);
    }
}

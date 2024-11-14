import java.util.Scanner;
public class converter { //Muhammad Danish bin Lokman Noor Hakim
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Converter available :\n1. Currency (MYR - YEN)\n2. Mass (kg - pound)\n3. Distance (km - m\n");
        System.out.print("Choose your converter : ");
        byte userInput = scan.nextByte();

        System.out.print("Insert Amount/Quantity : ");
        float userNumber = scan.nextInt();
        scan.close();

        float converterYen = (float) (userNumber * 32.3588);
        float converterMass = (float) (userNumber * 2.20462262);
        float converterDistance = (float) (userNumber * 1000);

        switch (userInput) {
            case 1:
                System.out.printf("\nRM %.0f = %.4f JPY", userNumber, converterYen); 
                break;
            case 2:
                System.out.printf("\nkg %.0f = %.4f lbs", userNumber, converterMass); 
                break;
            case 3:
                System.out.printf("\nkm %.0f  = %.4f m", userNumber, converterDistance); 
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}

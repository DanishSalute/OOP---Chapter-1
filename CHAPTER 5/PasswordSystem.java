import java.util.Scanner;

public class PasswordSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Create your password : ");
        String password = scan.nextLine();

        for (byte i = 1;i <= 3;i++){
            System.out.print("Enter your password : ");
            String trialString = scan.nextLine();
            if (trialString.compareTo(password) == 0){
                System.out.println("Password correct");
                break;
            }
            else{
                System.out.println("Incorrect Password, Maximum attempt 3 times, you have attempted " + i + " time");
            }
        }
    scan.close();
    }
}
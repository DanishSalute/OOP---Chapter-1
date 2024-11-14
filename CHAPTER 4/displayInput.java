import java.util.Scanner;

//Muhammad Danish bin Lokman Noor Hakim

public class displayInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input your first name : ");
        String firstName = scan.nextLine();

        System.out.print("Input your last name : ");
        String lastName = scan.nextLine();
        scan.close();

        System.out.println("\nHello\n" + firstName + " "  + lastName);
    }
}
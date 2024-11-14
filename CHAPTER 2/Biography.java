import java.util.Scanner;

public class Biography {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String name;
        byte age; 
        String hobby;
        String food;

        System.out.print("Enter your name : ");
        name = scan.nextLine();
        System.out.print("Enter your hobby : ");
        hobby = scan.nextLine();
        System.out.print("Enter your favorite food : ");
        food = scan.nextLine();
        System.out.print("Enter your age : ");
        age = scan.nextByte();
        scan.close();

        System.out.println("Your name is " + name + ", your age is " + age + ", your favorite food is " + food + " and your favorite hobby is " + hobby);
    }
}

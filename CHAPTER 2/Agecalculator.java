import java.util.Scanner;
public class Agecalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int year;

        System.out.println("What year were you born?");
        year = scan.nextInt();
        scan.close();

        int age = 2024 - year;

        System.out.println("Your age is : " + age);
    }
}

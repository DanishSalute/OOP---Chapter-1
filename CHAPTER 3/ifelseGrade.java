import java.util.Scanner; // include library scanner

public class ifelseGrade { // class name follows filename ifelseGrade
    public static void main(String[] args) { // Main function
        Scanner scan = new Scanner(System.in); // Assign Scanner object

        System.out.print("Enter your grade: "); // Instruction to user
        byte grade = scan.nextByte(); // Input from user

        if (grade < 0 || grade > 100) { // Check for invalid grade
            System.out.println("Invalid grade. Please enter a value between 0 and 100."); //print invalid grade if value is below 0 or above 100
        } 
        else if (grade < 40) { // Grade < 40
            System.out.println("Your Grade is F \"Failed\"");
        } 
        else if (grade >= 40 && grade < 50) { // 40 <= Grade < 50
            System.out.println("Your Grade is E \"Pass\"");
        } 
        else if (grade >= 50 && grade < 60) { // 50 <= Grade < 60
            System.out.println("Your Grade is D \"Nice\"");
        } 
        else if (grade >= 60 && grade < 70) { // 60 <= Grade < 70
            System.out.println("Your Grade is C \"Credit\"");
        } 
        else if (grade >= 70 && grade < 80) { // 70 <= Grade < 80
            System.out.println("Your Grade is B \"Good job!\"");
        } 
        else if (grade >= 80 && grade < 90) { // 80 <= Grade < 90
            System.out.println("Your Grade is A \"Excellent\"");
        } 
        else if (grade >= 90 && grade < 100) { // 90 <= Grade < 100
            System.out.println("Your Grade is A+ \"Almost perfect\"");
        } 
        else if (grade == 100) { // Grade = 100
            System.out.println("Your Grade is S \"Genius\"");
        }

        scan.close(); // Close Scanner to avoid leak
    }
}

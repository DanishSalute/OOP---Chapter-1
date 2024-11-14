import java.util.Scanner; //include library scanner

public class ArithmeticProg { //class name follows filename ArithmeticProg
    public static void main(String[] args){ //main function
        Scanner scan = new Scanner(System.in); //assign object name for scanner 

        int x; //variable to store value 
        int y; //second variable to store value

        System.out.print("Enter first number : "); //give instruction to user to enter first number
        x = scan.nextInt(); //ask for input from user for x variable
        System.out.print("Enter second number : "); //give instruction to user to enter second number
        y = scan.nextInt(); //ask for input from user for y variable

        int sum = x + y; //option if user choose addition
        int minus = x - y; //option if user choose subtraction
        int division = x / y; //option if user choose division
        int multiplication = x * y; //option if user choose multiply
        int remainder = x % y; //option if user choose modulo
        int x1 = x++; //option if user choose incrementing x
        int y1 = y++; //option if user choose incrementing y
        int x2 = x--; //option if user choose decrementing x
        int y2 = y--; //option if user choose decrementing y

        System.out.println("Select operations"); //Interface for user to choose operation
        System.out.println("1. Plus"); //option 1
        System.out.println("2. Minus"); //option 2
        System.out.println("3. Division"); //option 3
        System.out.println("4. Multiply"); //option 4
        System.out.println("5. Modulus"); //option 5
        System.out.println("6. Increment"); //option 6
        System.out.println("7. Decrement"); //option 7

        int input; //ask input from user to choose on which option

        System.out.print("Enter number : "); //give instruction to user to choose options
        input = scan.nextInt(); //ask input from user
        scan.close(); //close scanner to avoid leak

        switch (input) { //switch case
            case 1: //case 1 for addition
                System.out.println("Total for addtion : " + sum); //total of addition
                break; //break to stop the machine from reading other switch cases if the user choose this case
            case 2: //case 2 for subtraction
                System.out.println("Total for subtraction : " + minus); //total of subtraction
                break;//break to stop the machine from reading other switch cases if the user choose this case
            case 3: //case 3 for division
                System.out.println("Total for division : " + division);
                break;//break to stop the machine from reading other switch cases if the user choose this case
            case 4: //case 4 for multiply
                System.out.println("Total for multiplication : " + multiplication);
                break;//break to stop the machine from reading other switch cases if the user choose this case
            case 5: //case 5 for modulus
                System.out.println(("Remainder : " + remainder));
                break;//break to stop the machine from reading other switch cases if the user choose this case
            case 6: //case 6 for incrementing 
                System.out.println("First number increment : " + x1 + " Second number increment : " + y1);
                break;//break to stop the machine from reading other switch cases if the user choose this case
            case 7: //case 7 for decrementing
                System.out.println("First number decrement : " + x2 + "Second number decrement : " + y2);
                break;//break to stop the machine from reading other switch cases if the user choose this case
            default: //default if the user choose other than the given option
                break;//break to stop the machine from reading other switch cases if the user choose this case
        }
    }
}

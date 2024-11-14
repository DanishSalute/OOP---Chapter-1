import java.util.Scanner; //include library scanner

public class VendingMachine { //class name follows file name VendingMachine
    public static void main(String[]args){ //main function
        Scanner scan = new Scanner(System.in); //assign object name for scanner
        int quantity; //variable to store value for quantity
        double priceMocha = 2.80; //variable for price mocha
        double priceYoghurt = 2.50; //variable for price yoghurt
        double priceTea = 3.00; //variable for price tea
        double totalPrice; //total price of items


        System.out.println("-------------------------------------------------\n|               Welcome to My Stall             |\n-------------------------------------------------"); //interface for user to choose drinks
        System.out.println("|               List of beverages               |");
        System.out.println("|           1. Mocha Coffee        : RM 2.80    |");
        System.out.println("|           2. Yoghurt             : RM 2.50    |");
        System.out.println("|           3. Green Tea           : RM 3.00    |");
        System.out.println("_________________________________________________");

        System.out.print("\nInsert number of your desired drinks : "); //instruction to user to choose drinks

        int choice = scan.nextInt(); //ask for input from user for drinks


        System.out.print("\nInsert quantity of your desired drinks : "); //instruction to user to enter quantity of drinks

        quantity = scan.nextInt(); //ask for input from user for quantity of drinks
        scan.close(); //close scanner to avoid leak

        switch(choice){ //switch statement
        case 1: //option1 for mocha 
            totalPrice = quantity * priceMocha; //calculate total price of item
            System.out.println("Quantity of items : " + quantity); //show total quantity of items
            System.out.printf("Total price : RM %.2f " , totalPrice); //show total price
            break; //stop the machine to read other case if this case is chosen
        case 2:
            totalPrice = quantity * priceYoghurt; //calculate total price of item
            System.out.println("Quantity of items : " + quantity); //show total quantity of items
            System.out.printf("Total price : RM %.2f " , totalPrice); //show total price
            break; //stop the machine to read other case if this case is chosen
        case 3:
            totalPrice = quantity * priceTea; //calculate total price of item
            System.out.println("Quantity of items : " + quantity); //show total quantity of items
            System.out.printf("Total price : RM %.2f " , totalPrice); //show total price
            break; //stop the machine to read other case if this case is chosen
        default: //default statement
            System.out.println("Out of order"); //invalid option
            break; //stop the machine to read other case if this case is chosen
        }
    }
}

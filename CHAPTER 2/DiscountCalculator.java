import java.util.Scanner; //include library scanner

public class DiscountCalculator{ //class name follows file name - DicountCalculator
    public static void main(String[] args){ //main function
        Scanner scan = new Scanner(System.in); //assign object name to scanner

        System.out.println("Item name : "); //Give instruction to user to insert item name
        String itemName = scan.nextLine(); //ask for input from user
        System.out.println("Item price : "); //Give instruction to user to insert item price
        double itemPrice = scan.nextDouble(); //ask for input from user
        System.out.println("Quantity of item : "); //Give instruction to user to insert quantity of item
        int quantityItem = scan.nextInt(); //ask for input from user

        double totalPrice; //variable to store value for totalprice
        double totalAfterDiscount; //variable to store value for totaldiscount

        System.out.println("\n\nSelect discounts within the color name"); //Interface for user to choose discount
        System.out.println("White - 10%"); //option 1
        System.out.println("Red - 15%"); //option 2
        System.out.println("Blue - 20%"); //option 3
        System.out.println("Yellow - 25%"); //option 4
        System.out.println("Orange - 30%"); //option 5
        System.out.println("Green - 35%"); //option 6
        System.out.println("Purple - 40%"); //option 7

        System.out.println("Write the color name"); //instruction to user to write color code
        String discount = scan.next(); //ask for input from user for discount rate
        scan.close(); //close scanner

        discount = discount.toLowerCase(); //convert letters to all lower case incase user write in capital letter or one capital letter

        switch (discount) { //switch case
            case "white": //case White
                totalPrice = itemPrice * quantityItem; //calculate total of item
                totalAfterDiscount = (itemPrice * quantityItem) * 10 / 100; //calculate price after discount
                System.out.println("\n\nItem name : " + itemName); //shows item name
                System.out.println("Price : " + itemPrice); //shows price for 1 item
                System.out.println("quantity : " + quantityItem); //shows quanitity of items
                System.out.println("Total price : " + totalPrice); //show total price before discount
                System.out.println("Discount color code : " + discount); //discount rate color code
                System.out.println("Price after discount : " + totalAfterDiscount); //price after discount
                break; //stop the machine to read other case if this case is chosen
            case "red": //case red
                totalPrice = itemPrice * quantityItem;//calculate total of item
                totalAfterDiscount = (itemPrice * quantityItem) * 15 / 100; //calculate price after discount
                System.out.println("Item name : " + itemName); //shows item name
                System.out.println("Price : " + itemPrice); //shows price for 1 item
                System.out.println("quantity : " + quantityItem); //shows quanitity of items
                System.out.println("Total price : " + totalPrice); //show total price before discount
                System.out.println("Discount color code : " + discount); //discount rate color code
                System.out.println("Price after discount : " + totalAfterDiscount); //price after discount
                break; //stop the machine to read other case if this case is chosen
            case "blue": //case blue
                totalPrice = itemPrice * quantityItem; //calculate total of item
                totalAfterDiscount = (itemPrice * quantityItem) * 20 / 100; //calculate price after discount
                System.out.println("Item name : " + itemName); //shows item name
                System.out.println("Price : " + itemPrice); //shows price for 1 item
                System.out.println("quantity : " + quantityItem); //shows quanitity of items
                System.out.println("Total price : " + totalPrice); //show total price before discount
                System.out.println("Discount color code : " + discount); //discount rate color code
                System.out.println("Price after discount : " + totalAfterDiscount); //price after discount
                break; //stop the machine to read other case if this case is chosen
            case "yellow": //case yellow
                totalPrice = itemPrice * quantityItem; //calculate total of item
                totalAfterDiscount = (itemPrice * quantityItem) * 25 / 100; //calculate price after discount
                System.out.println("Item name : " + itemName); //shows item name
                System.out.println("Price : " + itemPrice); //shows price for 1 item
                System.out.println("quantity : " + quantityItem); //shows quanitity of items
                System.out.println("Total price : " + totalPrice); //show total price before discount
                System.out.println("Discount color code : " + discount); //discount rate color code
                System.out.println("Price after discount : " + totalAfterDiscount); //price after discount
                break; //stop the machine to read other case if this case is chosen
            case "orange": //case orange
                totalPrice = itemPrice * quantityItem; //calculate total of item
                totalAfterDiscount = (itemPrice * quantityItem) * 30 / 100; //calculate price after discount
                System.out.println("Item name : " + itemName); //shows item name
                System.out.println("Price : " + itemPrice); //shows price for 1 item
                System.out.println("quantity : " + quantityItem); //shows quanitity of items
                System.out.println("Total price : " + totalPrice); //show total price before discount
                System.out.println("Discount color code : " + discount); //discount rate color code
                System.out.println("Price after discount : " + totalAfterDiscount); //price after discount
                break; //stop the machine to read other case if this case is chosen
            case "green": //case green
                totalPrice = itemPrice * quantityItem; //calculate total of item
                totalAfterDiscount = (itemPrice * quantityItem) * 35 / 100; //calculate price after discount
                System.out.println("Item name : " + itemName); //shows item name
                System.out.println("Price : " + itemPrice); //shows price for 1 item
                System.out.println("quantity : " + quantityItem); //shows quanitity of items
                System.out.println("Total price : " + totalPrice); //show total price before discount
                System.out.println("Discount color code : " + discount); //discount rate color code
                System.out.println("Price after discount : " + totalAfterDiscount); //price after discount
                break; //stop the machine to read other case if this case is chosen
            case "purple": //case purple
                totalPrice = itemPrice * quantityItem; //calculate total of item
                totalAfterDiscount = (itemPrice * quantityItem) * 40 / 100; //calculate price after discount
                System.out.println("Item name : " + itemName); //shows item name
                System.out.println("Price : " + itemPrice); //shows price for 1 item
                System.out.println("quantity : " + quantityItem); //shows quanitity of items
                System.out.println("Total price : " + totalPrice); //show total price before discount
                System.out.println("Discount color code : " + discount); //discount rate color code
                System.out.println("Price after discount : " + totalAfterDiscount); //price after discount
                break; //stop the machine to read other case if this case is chosen
            default: //if user write other than options of cases
                System.out.println("Invalid color code"); //print this statement when default case is run
                break; //stop the machine to read other case if this case is chosen
        }
    }
}
import java.util.Scanner;

public class InputEvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = {};
        byte LIMIT = 5;

        for (int i = 1;i == LIMIT;i++){
            int[] newArray = new int[array.length + 1];
            System.out.print("Enter sequence for number" + i);
            newArray[i] = scan.nextInt();
        }    
    }
}

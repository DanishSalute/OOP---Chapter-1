public class SquareCalculator {
    public static void main(String[] args) {
        byte[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (byte i = 0;i < array.length;i++){
            sum += array[i] * array[i];
        }
        System.out.println("The sum for the power of two from integers 1-10 = " + sum); 
    }
}
public class EvenAndOdd {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int evenCount = 0, oddCount = 0;

        // Count even and odd numbers
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Create arrays for even and odd numbers
        int[] evenNumbers = new int[evenCount];
        int[] oddNumbers = new int[oddCount];
        int evenIndex = 0, oddIndex = 0;

        // Separate even and odd numbers
        for (int num : array) {
            if (num % 2 == 0) {
                evenNumbers[evenIndex++] = num;
            } else {
                oddNumbers[oddIndex++] = num;
            }
        }
        int sum = 0;
        int sum2 = 0;

        for (int i = 0;i < evenNumbers.length;i++){
            sum += evenNumbers[i];
        }

        for (int i = 0;i < oddNumbers.length;i++){
            sum2 += oddNumbers[i];
        }

        System.out.println("Sum of even numbers : " + sum);
        System.out.println("Sum of odd numbers : " + sum2);

        // Print even numbers
        System.out.print("Even numbers: ");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print odd numbers
        System.out.print("Odd numbers: ");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CalculateMarks highestAvg = new CalculateMarks();
        byte[] student1Marks = new byte[3];
        byte[] student2Marks = new byte[3];
        byte[] student3Marks = new byte[3];

        System.out.println("Student 1 Results (Input 3 Marks) : ");
        for (byte i = 0, displayNumber = 1; i < student1Marks.length; i++, displayNumber++){
            System.out.printf("Mark %d : \n", displayNumber);
            student1Marks[i] = scan.nextByte();
        }

        System.out.println("Student 2 Results (Input 3 Marks) : ");
        for (byte i = 0, displayNumber = 1; i < student2Marks.length; i++, displayNumber++){
            System.out.printf("Mark %d : \n", displayNumber);
            student2Marks[i] = scan.nextByte();
        }
        
        System.out.println("Student 3 Results (Input 3 Marks) : ");
        for (byte i = 0, displayNumber = 1; i < student3Marks.length; i++, displayNumber++){
            System.out.printf("Mark %d : \n", displayNumber);
            student3Marks[i] = scan.nextByte();
        }

        int student1 = student1Marks[0] + student1Marks[1] + student1Marks[2];
        int student2 = student2Marks[0] + student2Marks[1] + student2Marks[2];
        int student3 = student3Marks[0] + student3Marks[1] + student3Marks[2];

        highestAvg.calculateAverage(student1, student2, student3);
        scan.close();
    }
}

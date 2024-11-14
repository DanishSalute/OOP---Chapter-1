import java.util.Scanner;

public class Marks {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String name;
        String iD;
        String subject;
        byte test1;
        byte test2;

        System.out.println("Enter your name : ");
        name = scan.next();
        System.out.println("Enter student ID : ");
        iD = scan.next();
        System.out.println("Enter subject : ");
        subject = scan.next();
        System.out.println("Test 1 marks : ");
        test1 = scan.nextByte();
        System.out.println("Test 2 marks : ");
        test2 = scan.nextByte();
        scan.close();

        double average = (test1 + test2) / 2;

        System.out.println("Name : " + name);
        System.out.println("ID : " + iD);
        System.out.println("Subject : " + subject);
        System.out.println("Average mark : " + average);
    }
}

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double Salary = 600.00;
        double Commission = 0.5;

        System.out.print("Enter the gross sales for the week: RM ");
        double grossSales = scan.nextDouble();

        double commission = grossSales * Commission;
        double totalEarnings = Salary + commission;
        double percentageGross = grossSales * (5/100);

        System.out.println("Salesman's earnings for the week: RM " + totalEarnings);
        System.out.println("5% of gross sales" + percentageGross);

        scan.close();
    }
}

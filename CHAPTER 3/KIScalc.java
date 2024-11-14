public class KIScalc {
    public static void main(String[] args){
    double lateNumber = 5;
    double kisDeduction = 0.3;
    double deductionKis;

        if (lateNumber > 3){
            deductionKis = lateNumber * kisDeduction;
            System.out.println("Deduction is : " + deductionKis);
        }
    }
}

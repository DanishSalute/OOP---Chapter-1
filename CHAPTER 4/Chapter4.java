public class Chapter4 {
    public static void main(String[] args) {
        System.out.println("Printing from numbers 1 to 10");
        int i;
        for(i = 1;i <= 10;i++){
            System.out.println(i + "\t");
            if(i == 5)
            break;
        }
        System.out.println("Broke out of the loop at = " + i);
    }
}

public class CompundProg {
    public static void main(String[] args){

        //The first increment is called a prefix
        byte x = 1;
        byte y = x++;
        System.out.println("X : " + x);
        System.out.println("Y : " + y);
        //For prefix the x value is first stored in the y variable and then incremented by 1 into the x value

        //The second increment is called a postfix 
        byte a = 1;
        byte b = ++a;
        System.out.println("\nA : " + a);
        System.out.println("B : " + b);
        //The postfix is when the value is first incremented by 1 and then stored into the variables b and a

        //The third one is prefix decrement
        byte u = 2;
        byte v = x--;
        System.out.println("\nU : " + u);
        System.out.println("V : " + v);
        //For prefix the x value is first stored in the y variable and then decremented by 1 into the x value

        //The last one is postfix decrement
        byte i = 2;
        byte o = --a;
        System.out.println("\nI : " + i);
        System.out.println("O : " + o);
        //The postfix is when the value is first decremented by 1 and then stored into the variables b and a

    }
}

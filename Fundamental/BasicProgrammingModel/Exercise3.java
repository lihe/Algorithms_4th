import java.lang.*;

public class Exercise3 {
    public static void main(String[] args) {
        int integer1 = Integer.parseInt(args[0]);
        int integer2 = Integer.parseInt(args[1]);
        int integer3 = Integer.parseInt(args[2]);

        isEqual(integer1, integer2, integer3);
    }

    public static void isEqual(int num1, int num2, int num3){
        if (num1 == num2 && num2 == num3){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

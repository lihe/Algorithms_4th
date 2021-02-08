import java.lang.*;

public class Exercise14{
    public static void main(String[] args){
        System.out.println(lg(15));
        System.out.println("\nExpected: 3");
    }

    private static int lg(int n) {
        int logInt = 0;
        while (n > 0){
            logInt ++;
            n /= 2;
        }
        return logInt - 1;
    }
}
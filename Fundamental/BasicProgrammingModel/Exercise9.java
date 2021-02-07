import java.lang.*;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.println(Int_To_Binary(32));
        System.out.println("Expected: 100000");
    }

    private static String Int_To_Binary(int n){
        String result = "";
        while (n > 0){
            result = (n % 2) + result;
            n /= 2;
        }
        return result;
    }
}

import edu.princeton.cs.algs4.StdOut;

public class Exercise5 {
    public static void main(String[] args) {
        Is_Strictly_Between_0_and_1(1.12, 1.13);
        StdOut.println("Expected: false");
        Is_Strictly_Between_0_and_1(0.2, 1);
        StdOut.println("Expected: false");
        Is_Strictly_Between_0_and_1(0.5, 0.75);
        StdOut.println("Expected: true");
    }

    private static void Is_Strictly_Between_0_and_1(double x, double y){
        if (x > 0 && x < 1 && y > 0 && y < 1){
            StdOut.println("true");
        } else {
            StdOut.println("false");
        }
    }
}

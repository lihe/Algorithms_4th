import java.lang.*;

public class Exercise13 {
    public static void main(String[] args){
        int[][] mat = {{1, 2, 3}, {4, 5, 6}};
        transform(mat);
        System.out.println("\nExpected:");
        System.out.println("1 4\n" + "2 5\n" + "3 6\n");
    }

    private static void transform(int[][] mat){
        int[][] newMat =new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                newMat[j][i] =mat[i][j];
            }
        }
        print(newMat);
    }

    private static void print(int[][] mat){
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

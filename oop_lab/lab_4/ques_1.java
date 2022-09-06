import java.util.Scanner;

public class ques_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the dimensions of the matrix :");
        int m = s.nextInt();
        int n = s.nextInt();
        int sum = 0;
        int[][] mat = new int[m][n];
        System.out.println("enter the elements of array :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    System.out.print("  " + mat[i][j] + "  ");
                    sum += mat[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("sum of the non diagonal element of the array is:" + sum);
    }
}

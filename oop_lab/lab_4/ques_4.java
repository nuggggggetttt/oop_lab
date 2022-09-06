import java.util.Scanner;

class ques_4 {
	public static void main(String args[]) {
		int m1, n1, m2, n2, i, j, k;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter dimension of 1st matrix(m*n):");
		m1 = s.nextInt();
		n1 = s.nextInt();
		System.out.print("Enter dimension of 1st matrix(m*n):");
		m2 = s.nextInt();
		n2 = s.nextInt();
		if (n1 != m2)
			System.out.println("Matrices cannot be multiplied");
		else {
			int mat1[][] = new int[m1][n1];
			int mat2[][] = new int[m2][n2];
			int c[][] = new int[m1][n2];
			System.out.print("Enter matrix 1 elements:");
			for (i = 0; i < m1; i++) {
				for (j = 0; j < n1; j++)
					mat1[i][j] = s.nextInt();
			}
			System.out.print("Enter matrix 2 elements:");
			for (i = 0; i < m2; i++) {
				for (j = 0; j < n2; j++)
					mat2[i][j] = s.nextInt();
			}
			System.out.println("Multiplication of two matrix:");
			for (i = 0; i < m1; i++) {
				for (j = 0; j < n2; j++) {
					c[i][j] = 0;
					for (k = 0; k < n1; k++)
						c[i][j] += mat1[i][k] + mat2[k][j];
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}

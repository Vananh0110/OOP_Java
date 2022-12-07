import java.util.Scanner;

public class Bai_6_6 {
    public static void main(String[] args) {
        int row, column;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of matrix!");
        System.out.print("Enter row: ");
        row = input.nextInt();
        System.out.print("Enter column: ");
        column = input.nextInt();
        int A[][] = new int[row][column];
        int B[][] = new int[row][column];
        int result[][] = new int[row][column];
    
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("A[%d][%d]: ", i, j);
                A[i][j] = input.nextInt();
            }
        }

        System.out.print("\n");
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("B[%d][%d]: ", i, j);
                B[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
    
        System.out.println("Result: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
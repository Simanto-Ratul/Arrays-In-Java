import java.util.Scanner;

public class TowDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your row number : ");
        int row = sc.nextInt();
        System.out.print("Enter your column number : ");
        int col = sc.nextInt();

        int[][] numbers = new int[row][col];
        System.out.print("Enter your array elements : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Here is your array :- ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

}

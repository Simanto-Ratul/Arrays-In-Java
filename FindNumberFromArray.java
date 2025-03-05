import java.util.Scanner;

public class FindNumberFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your row number : ");
        int row = sc.nextInt();
        System.out.print("Enter your column number : ");
        int col = sc.nextInt();

        int[][] numbers = new int[row][col];

        System.out.print("Enter your array element : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter your array element which you want to find location : ");
        int x = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("x found at location (" + i + "," + j + ")");
                }
            }
        }
    }
}

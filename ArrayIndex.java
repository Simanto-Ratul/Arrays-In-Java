import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size : ");
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.print("Enter your array elements : ");

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (number[i] == x) {
                System.out.print("x found at : " + i);
            }
        }
    }
}

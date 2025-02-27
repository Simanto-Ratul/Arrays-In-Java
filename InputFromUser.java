import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size : ");
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.print("Enter your array elements : ");

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.print("Here is your array : ");

        for (int i = 0; i < size; i++) {
            System.out.print(number[i] + " ");
        }

    }
}
import java.util.Scanner;

public class Numerictriangle12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N (minimum 3): ");
        int N = scanner.nextInt();

        if (N < 3) {
            System.out.println("Value of N should be at least 3.");
        } else {
            printNumberTriangle(N);
        }
    }

    static void printNumberTriangle(int N) {
        for (int i = 1; i <= N; i++) {
            // Print leading spaces
            for (int j = N - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            System.out.println();
        }
    }
}

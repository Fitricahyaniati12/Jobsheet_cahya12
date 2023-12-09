import java.util.Scanner;

/**
 * NumericSquare12
 */
public class NumericSquare12 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N (minimum 3): ");
        int N = scanner.nextInt();

        System.out.print("Enter the number to display (3 or 5): ");
        int displayNumber = scanner.nextInt();
        
        if (N < 3) {
                System.out.println(" minimum N value is 3. ");
        } else {
            printNumericSquare(N);
        }
    }

    static void printNumericSquare(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

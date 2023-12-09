import java.util.Scanner;

/**
 * StarTriangle12
 */
public class StarTriangle12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input the value of N (minimum N value is set to 5)
        System.out.print(" Enter the value of N (minimum 5):  ");
        int N = scanner.nextInt();

        if (N < 5) {
            System.out.println("Minimum value for N is 5. exiting program. ");
        }else {
            // print the star triangle
            printStarTriangle(N);
        }   
        
    }

    static void printStarTriangle(int N) {
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= N; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
        }
        System.out.println();
    }
}
}

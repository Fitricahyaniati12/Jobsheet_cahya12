import java.util.Scanner;

public class Star12 {

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        
        System.out.print("Enter the value of N: ");
        int N = input12.nextInt();

        for (int i = 1; i <= N; i++){
            System.out.print("*");
        }
    }
}
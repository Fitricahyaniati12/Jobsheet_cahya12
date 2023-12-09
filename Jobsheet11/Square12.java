import java.util.Scanner;

public class Square12 {
     public static void main(String[] args) {

        Scanner input12 = new Scanner(System.in);
        System.out.print("Enter the value of N :" );
        int N = input12.nextInt();

        for (int i = 1; i <= N; i++) {
           // for (int j = 1; j <= N; j++) {
                //System.out.print("*");


                for (int iOuter = 1; iOuter <= N; iOuter++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
        }

    
    
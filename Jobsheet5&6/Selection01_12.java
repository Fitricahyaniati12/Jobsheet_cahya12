import java.util.Scanner;

/**
 * Selection01_12
 */
public class Selection01_12 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.print("Input a number = ");
        int number= input05.nextLine();
        if (number%2 == 0){
            System.out.print(number+" is a even number!");
         } else {
            System.out.print(number+" is an odd number!");
     }
        }
}
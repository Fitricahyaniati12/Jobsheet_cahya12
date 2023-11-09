import java.util.Scanner;

import javax.lang.model.SourceVersion;

/**
 * Selection112
 */
public class Selection112 {

    public static void main(String[] args) {
        
        Scanner input05 = new Scanner(System.in);
        System.out.print("Input a number = ");
        int number = input05.nextInt();
       // if (number%2 == 0) {
            //System.out.print(number+" is an even number!");
            
       // } else {
           // System.out.print(number+" is an odd number!");
            
      //  }
      String message = (number % 2 == 0) ? "is an even number!" : "is an odd number!";
       System.out.println(number + message);
    }
}
import java.util.Scanner;
import java.util.Random;

public class Quis12 {

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        Random rand = new Random();
        char menu = 'y';

        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;

            do {
                System.out.print("Guess the number (1-10): ");
                int answer = input12.nextInt();
                input12.nextLine();
               //success = (guess == number);

               if (answer == number) {
                    success = true;         
               } else {
                    System.out.println("Wrong guess! Try again. ");
                
               }
                
            } while (! success);

            System.out.print("Do you want to repeat the game (y/n) ");
            menu = input12.next().charAt(0);
            input12.nextLine();
            
        } while (menu == 'y' );
    }
}
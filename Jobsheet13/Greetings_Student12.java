import java.util.Scanner;

/**
 * Greetings_Student12
 */
public class Greetings_Student12 {
    public static String getGreetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }
    public static void main(String[] args) {
        String name = getGreetingRecipient();
        System.out.println("Thank you "+name+" may the force be with you!");
        
    }
}
import java.util.Scanner;

/**
 * ExpressingGratitde12
 */
public class ExpressingGratitde12 {

    public static String getGreetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }

    public static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " for being the best teacher in the world.\n" + 
        " you inspired in me love for learning and made me feel like I could ask you anything.");
    }

    public static void sayAdditionalGreetings(String additionalMessage) {
        System.out.print("Additional Greetings: " + additionalMessage);
    }

    public static void main(String[] args) {
        sayThankyou();


        // contoh pemanggilan sayAdditionGreetings()
        sayAdditionalGreetings("Wishing you a great day!");
        
    }
}
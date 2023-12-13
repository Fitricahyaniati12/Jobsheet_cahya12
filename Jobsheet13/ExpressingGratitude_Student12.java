import java.util.Scanner;

/**
 * ExpressingGratitude_Student12
 */
public class ExpressingGratitude_Student12 {

    public static String getGreetingRecipiet() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }

    public static void sayThankyou() {
        String name = getGreetingRecipiet();
        System.out.println("Thank you "+name+" for being the best teacher in the world.\n"+ " you inspired in me love for learning and made feel like I could ask you anything." );
    }

    public static void main(String[] args) {
        sayThankyou();

        
    }
}
import java.util.Scanner;

/**
 * CircleStudent112
 */
public class CircleStudent112 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int r;
            double circumference, phi, area;

            System.out.println("input radius: ");
            r = input.nextLine();

            phi = 3.14;
            area = phi * r * r;
            circumference = 2 * phi * r;

            System.out.println("area : "+ area);
            System.out.println("Circumference: "+ circumference);
        }
    
    
}
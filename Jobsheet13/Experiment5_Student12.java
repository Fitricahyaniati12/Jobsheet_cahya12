import java.util.Scanner;

/**
 * Experiment5_Student12
 */
public class Experiment5_Student12 {

    static void show (String str, int... a) {
        System.out.println("String: "+str);
        System.out.println("Number of arguments/parameters: " + a.length);

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        show("Progamming Fundaentals 2023", 100, 200);
        show("Information Tehcnology", 1, 2, 3, 4, 5);
        show("Informatics");
        
    }
}
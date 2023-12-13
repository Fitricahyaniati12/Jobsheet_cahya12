import java.util.Scanner;

/**
 * Experiment6_12
 */
public class Experiment6_12 {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol ;
        System.out.print("Input length = ");
        p = input.nextInt();
        System.out.print(" Input widht = ");
        l = input.nextInt();
        System.out.print("Input height = ");
        t = input.nextInt();

        L = p*l;
        System.out.println("Area of the rectangle = " + L);
        vol = p*l*t;
        System.out.println("Volume of the rectangle = " +vol);
    }

    static int calculateArea (int l, int w) {
        int area = l*w;
        return are;
    }
    static int calculateVolume (int l, int w, int h) {
        int vol = calculateArea(h, w)*h;
        return vol;
    }
   // public static void main(String[] args) {
        //Scanner inputScanner = new Scanner(System.in);
        //int p, l, t, L, vol;
        //System.out.print("Input length = ");
       // p = input.nextInt();
        //System.out.print("Input widht = ");
        ////l = input.nextInt();
        //System.out.print("Input height = ");
        //t = input.nextInt();

        //L = calculateArea(p, l);
        //System.out.println("Area of the rectangle = ");
        //vol = calculateVolume(t, p, l);
        //System.out.println("Volume of the rectangle = "+vol);
        
    }

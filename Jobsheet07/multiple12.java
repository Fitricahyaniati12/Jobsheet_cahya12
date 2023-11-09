import java.util.Scanner;

/**
 * ForMultiplesStudent12
 */
public class ForMultiplesStudent12 {

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.print("Input the multiple = ");
        int multiple = input12.nextInt();
        System.out.print("Input the sum = ");
        int sum = input12.nextInt();
        System.out.print("Input the counter = ");
        int counter = input12.nextInt();

        int average = 0;

        for(int i=1;i<=50;i++){
            if(i%multiple == 0){
                sum = sum + i;
                counter++;
                //System.out.print(i+"-");
            }
        }
        System.out.printf("There average of all multiples of %d.", multiple, average);
       
    }  
}

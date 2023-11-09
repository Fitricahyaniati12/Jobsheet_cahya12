import java.util.Scanner;

/**
 * Selection312
 */
public class Selection312 {

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        double operand1, operand2, result;
        char operator;
        System.out.print("input operand1");
        operand1 = input12.nextDouble();
        System.out.print("input operand2");
        operand2 = input12.nextDouble();
        System.out.print("input operator (+ - */): ");
        operator = input12.next().charAt(0);
        switch (operator) {
            case '+':
                 result = operand1 + operand2;
                 System.out.print(operand1 + " + " + operand2 + "=" + result);
                 break;
        
            case '-':
                result = operand1 - operand2;
                System.out.print(operand1 + "-" + operand2 + "=" + result);
                break;
            case '*':
                result = operand1 - operand2;
                System.out.print(operand1 + "*" + operand2 + "=" + result);
                break;
            case '/':
            result = operand1 - operand2;
                System.out.print(operand1 + "/" + operand2 + "=" + result);
                break;
        }
    }
}
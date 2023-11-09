import java.util.Scanner;

public class WhileOvertimePayStudent12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numEmployee, overtimeHours;
        double overtimePay = 0, totalOvertimePay = 0;
        String position;

        System.out.print("Employee number = ");
        numEmployee = input.nextInt();

        int i = 0;
        while (i < numEmployee) {
            System.out.print("position of employee " + (i + 1) + " (director, manager, staff) = ");
            position = input.next();
            System.out.print("Employee " + (i + 1) + " overtime hours = ");
            overtimeHours = input.nextInt();

            if (position.equalsIgnoreCase("director")) {
                continue;
            } else if (position.equalsIgnoreCase("manager")) {
                overtimePay = overtimeHours * 100000;
            } else if (position.equalsIgnoreCase("staff")) {
                overtimePay = overtimeHours * 75000;
            }

            totalOvertimePay += overtimePay;

            System.out.println("total of overtime pay = " + totalOvertimePay);

            i++;
        }
    }
}

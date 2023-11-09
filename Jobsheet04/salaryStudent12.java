import java.util.Scanner;

/**
 * salaryStudent12
 */
public class salaryStudent12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numAttendance, numAbsence, totalSalary;
        int salary, salaryDeduction;

        System.out.println("input salary: ");
        salary = input.nextInt();
        System.out.println("input salary deduction: ");
        salaryDeduction = input.nextInt();
        System.out.println("input attendece number: ");
        numAttendance = input.nextInt();
        System.out.println("input absence number: ");
        numAbsence = input.nextInt();

        totalSalary = (numAttendance * salary) - (numAbsence * salaryDeduction);

        System.out.println("total salary: "+totalSalary);

    
    }
}
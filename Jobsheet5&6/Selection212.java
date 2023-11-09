import java.util.Scanner;

import javax.lang.model.SourceVersion;

/**
 * Selection212
 */
public class Selection212 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.println("nilai uas :");
        float finalExam = input05.nextFloat();
        System.out.println("nilai uts :");
        float midExam = input05.nextFloat();
        System.out.println("nilai kuis :");
        float quiz = input05.nextFloat();
        System.out.println("nilai tugas :");
        float tugas = input05.nextFloat();
        float total = (finalExam * 0.4F) + (midExam * 0.3f) + (tugas * 0.2F);
        System.out.println(total);

        if (total<= 39) {
            String message = total >=39 ? "Retake" : "pass";
            String letterGrade = "E";
            System.out.println("Final Grade = " + letterGrade +"and the decision is" + message );

        } else if (total <= 50) {
            String message = total >=50 ? "Retake" : "pass";
             String letterGrade = "D";
             System.out.println("Final Grade = " + letterGrade +"and the decision is" + message );
         
            
        } else if (total<=60){
            String message = total >=60 ? "Retake" : "pass";
             String letterGrade = "C";
             System.out.println("Final Grade = " + letterGrade +"and the decision is" + message );
        } else if (total<= 65){
            String message = total >=65 ? "Retake" : "pass";
             String letterGrade = "C+";
             System.out.println("Final Grade = " + letterGrade +"and the decision is" + message );
        } else if (total<= 73){
            String message = total >=73 ? "Retake" : "pass";
             String letterGrade = "B";
             System.out.println("Final Grade = " + letterGrade +"and the decision is" + message );
        } else if (total<=80){
            String message = total >=80 ? "Retake" : "pass";
             String letterGrade = "B+";
             System.out.println("Final Grade = " + letterGrade +"and the decision is" + message );
        }  else if (total<=100){
            String message = total >=100 ? "Retake" : "pass";
             String letterGrade = "A";
             System.out.println("Final Grade = " + letterGrade +"and the decision is" + message );
        }   else {
            System.out.println("nilai yang anda masukan salah, coba lagi");
        }      
        }






    }
            
        
     
     
     
     
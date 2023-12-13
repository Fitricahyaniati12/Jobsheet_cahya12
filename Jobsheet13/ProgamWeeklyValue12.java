import java.util.Scanner;

import javax.xml.transform.SourceLocator;

/**
 * ProgamWeeklyValue12
 */
public class ProgamWeeklyValue12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Jumlahsiswa = 5;
        int Jumlahminggu = 7;
        double[][] nilaisiswa = new double[Jumlahsiswa][Jumlahminggu];

        // input data nilai siswa
        for (int i = 0; i < Jumlahsiswa; i++) {
            System.out.println("Masukkan nilai siswa " + (i + 1) + " untuk 7 minggu: ");
            for (int j = 0; j< Jumlahminggu; j++) {
                System.out.print(" Minggu " + (j + 1 ) + " : ");
                nilaisiswa[i][i] = scanner.nextDouble();
            }
        }

    }
    
}
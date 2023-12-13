import java.util.Scanner;

/**
 * ProgamWeeklyValue212
 */
public class ProgamWeeklyValue212 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // int Jumlahsiswa = 5;
        //int Jumlahminggu = 7;

        System.out.print("Masukkan jumlah siswa :");
        int Jumlahsiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah minggu: ");
        int Jumlahminggu = scanner.nextInt();

        double[][] nilaisiswa = new double[Jumlahsiswa][Jumlahminggu];

        // input data nilai siswa
        for (int i = 0; i < Jumlahsiswa; i++ ) {
            System.out.println("Masukkan  nilai siswa " + (i + 1) + " untuk " + Jumlahminggu + " minggu: ");
            for (int j = 0; j < Jumlahminggu; j++) {
                System.out.print("Minggu " + (j + 1) + " : ");
                nilaisiswa[i][j] = scanner.nextDouble();
               // System.out.print(nilaisiswa[i][j] + " ");
            }
            System.out.println();
        } 
        scanner.close();   
    }
}
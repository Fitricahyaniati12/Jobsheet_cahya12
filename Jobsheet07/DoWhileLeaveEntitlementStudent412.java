import java.util.Scanner;

public class DoWhileLeaveEntitlementStudent412 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        int leaveEntitlement = 5;
        int numLeave = 0;
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("jatah cuti: ");
        jatahCuti = input12.nextInt();

        while (jatahCuti > 0) {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = input12.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = input12.nextInt();

                if (jumlahHari > 0 && jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    numLeave += jumlahHari;
                    System.out.println("sisa jatah cuti: " + jatahCuti);
                } else {
                    if (jumlahHari <= 0) {
                        System.out.println("Jumlah hari tidak valid.");
                    } else {
                        System.out.println("sisa jatah cuti anda tidak mencukupi.");
                    }
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                break; // Exit the loop
            } else {
                System.out.println("Masukkan tidak valid. Silakan masukkan 'y' atau 't'.");
            }
        }

        System.out.println("Anda telah menggunakan " + numLeave + " hari cuti.");
    }
}

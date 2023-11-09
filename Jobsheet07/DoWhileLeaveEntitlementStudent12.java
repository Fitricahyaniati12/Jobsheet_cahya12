import java.util.Scanner;

public class DoWhileLeaveEntitlementStudent12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        int leaveEntitlement = 5;
        int numLeave = 0;
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("jatah cuti: ");
        jatahCuti = input12.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = input12.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = input12.nextInt();

                if (jumlahHari > 0 && jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("sisa jatah cuti anda tidak mencukupi atau jumlah hari tidak valid");
                    break;
                }
            } else {
                break;
            }
        } while (jatahCuti > 0);
    }
}
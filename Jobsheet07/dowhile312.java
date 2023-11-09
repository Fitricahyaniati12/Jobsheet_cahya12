import java.util.Scanner;

public class dowhile312{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leaveEntitlement = 5;
        int numLeave = 0;
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("jatah cuti: ");
        jatahCuti = input.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = input.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = input.nextInt();

            if (jumlahHari > 0) {
            if (jumlahHari <= jatahCuti) {
                jatahCuti -= jumlahHari;
                System.out.println("sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("sisa jatah cuti anda tidak mencukupi");
                    }
                } else {
                    System.out.println("jumlah hari tidak valid");
                }
            }
        } while (jatahCuti > 0 && konfirmasi.equalsIgnoreCase("y"));

        input.close();
    }
}

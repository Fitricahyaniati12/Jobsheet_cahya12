import java.util.Scanner;

/**
 * CubeStudent12
 */
public class CubeStudent12 {

    public static double hitungLuasKubus(double sisi) {
        return 6 * sisi * sisi;
    }

    public static double hitungVolumeKubus(double sisi) {
        return sisi * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();

        // menghitung luas kubus
        double luas = hitungLuasKubus(sisi);
        System.out.println("Luas Kubus: " + luas);

        // menghitung volume kubus
        double volume = hitungVolumeKubus(sisi);
        System.out.println("Volume kubus: " + volume);

        scanner.close();
    }
}
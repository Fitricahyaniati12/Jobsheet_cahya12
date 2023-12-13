/**
 * Progamku12
 */
public class Progamku12 {

    public static void TampilHinggaKe(int i) {
        for (int j = 1; j <= i; j++ ) {
            System.out.print(j);

        } 
    }

    public static void Jumlah (int biL1, int biL2) {
        return (bil1 + bil2);
    }
    public static void TampilJumlah (int biL1, int biL2) {
        TampilHinggaKe(Jumlah(bil1, bil2));
    }

    public static void main(String[] args) {
       // int temp = Jumlah (1, 1);
       // TampilJumlah(temp, 5);
       int temp = Jumlah (1, 1);
        TampilJumlah(temp, 5);
    }

}
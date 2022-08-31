import java.util.Scanner;

public class diskon {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int jumlah_barang ;
            int barang;
            int total;
            int diskon;

            System.out.println("Masukkan Harga Barang Per Unit : ");
            barang = input.nextInt();
            System.out.println("Masukkan Jumlah Barang : ");
            jumlah_barang = input.nextInt();

            diskon = (int) (barang * jumlah_barang * (0.15));
            total = (int) (barang * jumlah_barang) - diskon;

            System.out.println("Total Harga : " + total);
            /*
            if (belanja >= 100000) {
                diskon = (int) (belanja * 0.05);
                total = belanja - diskon;
                System.out.println("Anda mendapatkan diskon 5%");
                System.out.println("Total yang harus dibayar adalah : " + total);
            } else {
                System.out.println("Anda tidak mendapatkan diskon");
                System.out.println("Total yang harus dibayar adalah : " + belanja);
            }
            */
        }
    }
}

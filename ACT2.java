import java.util.Scanner;

public class ACT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Cek Status Kelulusan ===");
        System.out.println("1. Masukkan Nilai");
        System.out.println("2. Keluar");
        System.out.print("Pilih menu (1/2): ");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.print("Masukkan nilai Anda: ");
                int nilai = input.nextInt();

                if (nilai >= 60) {
                    System.out.println("Selamat, Anda Lulus!");
                } else {
                    System.out.println("Maaf, Anda Tidak Lulus.");
                }
                break;
            case 2:
                System.out.println("Terima kasih!");
                return;
            default:
                System.out.println("Menu tidak tersedia.");
                break;
        }
        input.close();
    }
}
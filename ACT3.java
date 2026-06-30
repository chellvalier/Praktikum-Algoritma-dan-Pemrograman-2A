import java.util.Scanner;

public class ACT3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan = "y";

        while (pilihan.equalsIgnoreCase("y")) {
            System.out.print("Masukkan batas angka untuk dijumlahkan: ");
            int batas = input.nextInt();
            int total = 0;

            System.out.println("Proses Penjumlahan:");
            for (int i = 1; i <= batas; i++) {
                total += i;
                System.out.print(i + (i == batas ? "" : " + "));
            }

            System.out.println("\nTotal Akhir: " + total);

            System.out.print("\nApakah ingin mencoba lagi? (y/n): ");
            pilihan = input.next();
        }

        System.out.println("Program Selesai. Terima kasih!");
        input.close();
    }
}
import java.util.Scanner;

public class ACT4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kapasitas array: ");
        int kapasitas = input.nextInt();
        
        int[] nilai = new int[kapasitas];
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai indeks ke-" + i + ": ");
            nilai[i] = input.nextInt();

            total += nilai[i];
        }

        double rataRata = (double) total / kapasitas;
        System.out.println();
        System.out.println("Total Nilai: " + total);
        System.out.println("Rata-rata: " + rataRata);

        input.close();
    }
}
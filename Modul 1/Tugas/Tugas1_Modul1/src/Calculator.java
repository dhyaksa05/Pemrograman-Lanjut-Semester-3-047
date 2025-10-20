import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Masukkan jumlah angka: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Jumlah angka harus lebih dari 0. Silakan coba lagi.");
            }
        } while (n <= 0);

        int[] angka = new int[n];
        System.out.println("Masukkan angka-angka:");

        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += angka[i];
        }

        double rataRata = (double) total / n;
        System.out.println("Rata-rata adalah: " + rataRata);

        scanner.close();
    }
}
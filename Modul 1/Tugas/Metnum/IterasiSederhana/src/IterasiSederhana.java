import java.util.Scanner;

public class IterasiSederhana {

    static double g(double x) {
        return (x * x - 3) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("METODE ITERASI SEDERHANA");
        System.out.println("Persamaan: x² - 2x - 3 = 0");
        System.out.println("g(x) = (x² - 3) / 2\n");

        System.out.print("Nilai awal (x0): ");
        double x = sc.nextDouble();
        System.out.print("Toleransi: ");
        double tol = sc.nextDouble();
        System.out.print("Max iterasi: ");
        int max = sc.nextInt();

        System.out.println("\nIter\tx\t\tError");
        System.out.println("------------------------------");

        for (int i = 0; i < max; i++) {
            double xn = g(x);
            double err = Math.abs(xn - x);

            System.out.printf("%d\t%.8f\t%.8e\n", i, xn, err);

            if (err < tol) {
                System.out.println("------------------------------");
                System.out.println("✓ Konvergen!");
                System.out.println("Akar: x = " + xn);
                System.out.println("Iterasi: " + (i + 1));
                return;
            }
            x = xn;
        }

        System.out.println("✗ Tidak konvergen");
        sc.close();
    }
}
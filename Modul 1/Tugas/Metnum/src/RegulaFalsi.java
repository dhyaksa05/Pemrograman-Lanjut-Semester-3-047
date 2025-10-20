import java.util.Scanner;

public class RegulaFalsi {

    // Fungsi: f(x) = x^3 - 4x - 9
    public static double f(double x) {
        return Math.pow(x, 3) - 4*x - 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== METODE REGULA FALSI ===");
        System.out.println("f(x) = x³ - 4x - 9\n");

        System.out.print("Batas bawah (a): ");
        double a = sc.nextDouble();

        System.out.print("Batas atas (b): ");
        double b = sc.nextDouble();

        System.out.print("Toleransi: ");
        double tol = sc.nextDouble();

        System.out.print("Max iterasi: ");
        int maxIter = sc.nextInt();

        double fa = f(a), fb = f(b);

        if (fa * fb > 0) {
            System.out.println("\nTidak ada akar dalam interval!");
            return;
        }

        System.out.println("\nIter\tc\t\tf(c)");
        System.out.println("------------------------------------");

        double c = 0, fc;
        for (int i = 1; i <= maxIter; i++) {
            c = (a * fb - b * fa) / (fb - fa);
            fc = f(c);

            System.out.printf("%d\t%.6f\t%.8f\n", i, c, fc);

            if (Math.abs(fc) < tol) {
                System.out.println("\nAkar: x = " + c);
                return;
            }

            if (fa * fc < 0) {
                b = c;
                fb = fc;
            } else {
                a = c;
                fa = fc;
            }
        }

        System.out.println("\nTidak konvergen. Hasil: x = " + c);
        sc.close();
    }
}
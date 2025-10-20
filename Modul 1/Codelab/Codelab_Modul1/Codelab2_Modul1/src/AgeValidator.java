import java.util.Scanner;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class AgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        System.out.println("=== PROGRAM VALIDASI USIA ===");

        while (!validInput) {
            try {
                System.out.print("Masukkan usia Anda (0-120): ");
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    throw new InvalidAgeException("Input tidak boleh kosong!");
                }
                int usia = Integer.parseInt(input);
                validateAge(usia);
                System.out.println("✅ Usia yang Anda masukkan valid: " + usia + " tahun");
                displayAgeCategory(usia);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("❌ Error: Input harus berupa angka!");
                System.out.println();
            } catch (InvalidAgeException e) {
                System.out.println("❌ " + e.getMessage());
                System.out.println();
            }
        }
        scanner.close();
        System.out.println("\nTerima kasih telah menggunakan program ini!");
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age <= 0) {
            throw new InvalidAgeException(
                    "Usia tidak valid! Usia harus lebih besar dari 0. Anda memasukkan: " + age
            );
        }
        if (age >= 120) {
            throw new InvalidAgeException(
                    "Usia tidak valid! Usia harus kurang dari 120 tahun. Anda memasukkan: " + age
            );
        }
    }

    public static void displayAgeCategory(int age) {
        String category;
        if (age < 13) {
            category = "Anak-anak";
        } else if (age < 18) {
            category = "Remaja";
        } else if (age < 60) {
            category = "Dewasa";
        } else {
            category = "Lansia";
        }
        System.out.println("    Kategori usia: " + category);
    }
}
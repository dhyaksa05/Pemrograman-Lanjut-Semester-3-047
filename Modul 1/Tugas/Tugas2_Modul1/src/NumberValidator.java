import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class NumberValidator {

    public static void validatePositiveNumber(String input) throws InvalidNumberException {
        try {
            double number = Double.parseDouble(input.trim());
            if (number <= 0) {
                throw new InvalidNumberException("Error: Angka harus positif (lebih dari 0)!");
            }
            System.out.println(" Valid! Angka " + number + " adalah angka positif.");
        } catch (NumberFormatException e) {
            throw new InvalidNumberException("Error: Input bukan angka yang valid!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("VALIDASI ANGKA POSITIF");

        while (true) {
            try {
                System.out.print("Masukkan angka positif: ");
                String input = scanner.nextLine();

                if (input.trim().isEmpty()) {
                    throw new InvalidNumberException("Error: Input tidak boleh kosong!");
                }

                validatePositiveNumber(input);
                break;

            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
                System.out.println("Silakan coba lagi.\n");
            }
        }

        scanner.close();
    }
}
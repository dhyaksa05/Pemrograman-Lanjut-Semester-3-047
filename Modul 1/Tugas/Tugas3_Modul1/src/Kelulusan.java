import java.util.Scanner;

public class Kelulusan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAM PENENTUAN KELULUSAN MAHASISWA");

        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        if (namaMahasiswa.trim().isEmpty()) {
            System.out.println("Error: Nama mahasiswa tidak boleh kosong!");
            scanner.close();
            return;
        }

        System.out.print("Masukkan nilai ujian akhir (0-100): ");
        String nilaiString = scanner.nextLine();

        try {
            int nilaiUjian = Integer.parseInt(nilaiString);

            if (nilaiUjian < 0 || nilaiUjian > 100) {
                System.out.println("Error: Nilai harus berada dalam rentang 0-100!");
                scanner.close();
                return;
            }

            String statusKelulusan;
            if (nilaiUjian >= 60) {
                statusKelulusan = "Lulus";
            } else {
                statusKelulusan = "Tidak Lulus";
            }

            String grade;
            if (nilaiUjian > 80.0) {
                grade = "A";
            } else if (nilaiUjian >= 75.0 && nilaiUjian <= 80.0) {
                grade = "B+";
            } else if (nilaiUjian >= 70.0 && nilaiUjian <= 74.9) {
                grade = "B";
            } else if (nilaiUjian >= 60.0 && nilaiUjian <= 69.0) {
                grade = "C+";
            } else if (nilaiUjian >= 55.0 && nilaiUjian <= 59.9) {
                grade = "C";
            } else if (nilaiUjian >= 40.0 && nilaiUjian <= 54.9) {
                grade = "D";
            } else {
                grade = "E";
            }

            System.out.println("HASIL KELULUSAN");
            System.out.println("Nama Mahasiswa     : " + namaMahasiswa);
            System.out.println("Nilai Ujian Akhir  : " + nilaiUjian);
            System.out.println("Grade              : " + grade);
            System.out.println("Status Kelulusan   : " + statusKelulusan);

        } catch (NumberFormatException e) {
            System.out.println("Error: Input nilai harus berupa angka!");
        }

        scanner.close();
    }
}


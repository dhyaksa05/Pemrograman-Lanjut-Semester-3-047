public class BubbleSort {
    /**
     * Method bubbleSort untuk mengurutkan array dengan menampilkan setiap tahapan
     * @param arr Array integer yang akan diurutkan
     *
     * Cara kerja:
     * 1. Membandingkan setiap pasangan elemen yang berdekatan
     * 2. Jika elemen kiri > elemen kanan, maka tukar posisinya
     * 3. Proses diulang hingga tidak ada lagi pertukaran (data sudah terurut)
     *
     * Optimalisasi:
     * - Menggunakan flag 'swapped' untuk mendeteksi apakah ada pertukaran
     * - Jika tidak ada pertukaran dalam satu lintasan, berarti data sudah terurut
     * - Proses dihentikan tanpa melanjutkan ke lintasan berikutnya
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Tampilkan data awal
        System.out.println("Data array : " + arrayToString(arr));
        System.out.println();

        // Loop untuk setiap lintasan
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            System.out.println("Lintasan " + (i + 1) + " :");

            // Loop untuk membandingkan elemen bersebelahan
            for (int j = 0; j < n - i - 1; j++) {
                // Cek apakah perlu ditukar
                if (arr[j] > arr[j + 1]) {
                    // Tampilkan sebelum tukar
                    System.out.print(" Tahap " + (j + 1) + " tukar antara " + arr[j] + " dan " + arr[j + 1] + " : ");

                    // Tukar elemen
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;

                    // Tampilkan setelah tukar
                    System.out.println(arrayToString(arr));
                } else {
                    // Data tidak perlu ditukar
                    System.out.println(" Tahap " + (j + 1) + " data tetap\t\t : " + arrayToString(arr));
                }
            }

            System.out.println();

            // OPTIMALISASI: Jika tidak ada pertukaran, data sudah terurut
            if (!swapped) {
                System.out.println("....dst");
                System.out.println("\n(Data sudah terurut, proses dihentikan untuk mengoptimalkan waktu)");
                break;
            }
        }

        System.out.println("Hasil akhir : " + arrayToString(arr));
    }

    /**
     * Method helper untuk mengkonversi array menjadi string dengan format [ ]
     * @param arr Array yang akan dikonversi
     * @return String representasi dari array
     */
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(" ");
            }
        }
        sb.append(" ]");
        return sb.toString();
    }

    public static void main(String[] args) {
        // Data contoh sesuai gambar
        int[] data = {5, 4, 9, 7, 2};

        System.out.println("=== BUBBLE SORT DENGAN OUTPUT PER TAHAPAN ===");
        System.out.println();

        bubbleSort(data);

        System.out.println("\n=== SELESAI ===");
    }
}
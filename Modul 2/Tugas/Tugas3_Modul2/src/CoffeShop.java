import java.util.Scanner;

class CoffeeShop {
    static class MenuItem {
        String name;
        int price;

        MenuItem(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuItem[] menu = {
                new MenuItem("Espresso", 15000),
                new MenuItem("Americano", 18000),
                new MenuItem("Cappuccino", 22000),
                new MenuItem("Latte", 25000),
                new MenuItem("Mocca", 28000)
        };

        int total = 0;

        System.out.println("===== SELAMAT DATANG DI COFFEE SHOP =====");
        System.out.println("\nMenu Minuman:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].name + " - Rp" + menu[i].price);
        }

        while (true) {
            System.out.print("\nPilih menu (1-5) atau 0 untuk selesai: ");
            int pilihan = sc.nextInt();

            if (pilihan == 0) {
                break;
            } else if (pilihan >= 1 && pilihan <= 5) {
                MenuItem item = menu[pilihan - 1];
                System.out.print("Jumlah: ");
                int jumlah = sc.nextInt();
                int subtotal = item.price * jumlah;
                total += subtotal;
                System.out.println("✓ " + item.name + " x" + jumlah + " = Rp" + subtotal);
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        System.out.println("\n===== STRUK PEMBELIAN =====");
        System.out.println("Total Harga: Rp" + total);

        if (total > 0) {
            System.out.print("Uang yang dibayarkan: Rp");
            int bayar = sc.nextInt();

            if (bayar >= total) {
                int kembalian = bayar - total;
                System.out.println("Kembalian: Rp" + kembalian);
                System.out.println("\nTerima kasih telah berkunjung!");
            } else {
                System.out.println("Uang tidak cukup!");
            }
        } else {
            System.out.println("Anda tidak membeli apapun.");
        }

        sc.close();
    }
}
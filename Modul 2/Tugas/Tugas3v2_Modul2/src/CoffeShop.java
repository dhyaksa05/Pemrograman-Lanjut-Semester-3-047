import java.util.Scanner;

class CoffeeShop {

    public static final int EXIT_OPTION = 0;
    public static final int MIN_MENU = 1;
    public static final int MAX_MENU = 5;



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Extract Method
        MenuItem[] menu = initializeMenu();

        int total = 0;

        System.out.println("===== SELAMAT DATANG DI COFFEE SHOP =====");
        System.out.println("\nMenu Minuman:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].getName() + " - Rp" + menu[i].getPrice());
        }

        while (true) {
            System.out.print("\nPilih menu (1-5) atau 0 untuk selesai: ");
            //Rename Method/Variable
            int menuChoice = sc.nextInt();

            //Replace Magic Number with Symbolic Constant
            if (menuChoice == EXIT_OPTION) {
                break;
                //Replace Magic Number with Symbolic Constant
            } else if (menuChoice >= MIN_MENU && menuChoice <= MAX_MENU) {
                MenuItem item = menu[menuChoice - 1];
                System.out.print("Jumlah: ");
                int quantity = sc.nextInt();
                int subtotal = item.getPrice() * quantity;
                total += subtotal;
                System.out.println("✓ " + item.getName() + " x" + quantity + " = Rp" + subtotal);
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        System.out.println("\n===== STRUK PEMBELIAN =====");
        System.out.println("Total Harga: Rp" + total);

        if (total > 0) {
            System.out.print("Uang yang dibayarkan: Rp");
            int amoutPaid = sc.nextInt();

            if (amoutPaid >= total) {
                int change = amoutPaid - total;
                System.out.println("Kembalian: Rp" + change);
                System.out.println("\nTerima kasih telah berkunjung!");
            } else {
                System.out.println("Uang tidak cukup!");
            }
        } else {
            System.out.println("Anda tidak membeli apapun.");
        }

        sc.close();
    }

    private static MenuItem[] initializeMenu() {
        MenuItem[] menu = {
                new MenuItem("Espresso", 15000),
                new MenuItem("Americano", 18000),
                new MenuItem("Cappuccino", 22000),
                new MenuItem("Latte", 25000),
                new MenuItem("Mocca", 28000)
        };
        return menu;
    }
}
public  class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 10.5, 10);
        Library lib = new Library("Perpustakaan Kota", book1);
        lib.showLibraryInfo();

        book1.adjustStock(5);

        lib.showLibraryInfo();
    }
}
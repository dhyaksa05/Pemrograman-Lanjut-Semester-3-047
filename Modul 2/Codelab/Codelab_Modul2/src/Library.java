public class Library {
    private Book book;
    private String location;

    public Library(String location, Book book) {
        this.setLocation(location);
        this.setBook(book);

    }

    public void showLibraryInfo(){
        System.out.println("Library Location : " + getLocation());
        getBook().displayInfo();

    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }
}
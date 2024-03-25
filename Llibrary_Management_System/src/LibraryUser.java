import java.util.ArrayList;
import java.util.List;

public class LibraryUser extends User {

    private final List<Book> borrowedBooks;

    public LibraryUser(String name, int membershipID) {
        super(name, membershipID);
        borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(int bookID) {
        System.out.println("Borrowed book with ID: " + bookID);
    }

    public void borrowBook(Book book) {
        System.out.println("Borrowed book: " + book.getTitle());
        borrowedBooks.add(book);
    }

    public void borrowBook() {
        System.out.println("Borrowed a book.");

    }

    @Override
    public void displayUserInfo() {
        super.displayUserInfo();
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println("- " + book.getTitle());
        }
    }

    public Book getBookByTitle(String title) {
        for (Book book : borrowedBooks) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {

        LibraryUser user = new LibraryUser("Sifat Ali", 011222333);
        user.displayUserInfo();

        Book book1 = new Book("Sherlock Holmes", "Arthur Conan Doyle.", 101);
        Book book2 = new Book("Metamorphosis ", "Franz kafka", 102);


        user.borrowBook(book1);
        user.borrowBook(book2);

        user.displayUserInfo();
    }
}
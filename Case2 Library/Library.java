import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to library: " + book.title);
    }

    public void borrowBook(Borrower borrower, Book book) {
            borrower.borrowBook(book);
            books.remove(book);
            System.out.println(borrower.getName() + " borrowed: " + book.title);
    }

    public void returnBook(Borrower borrower, Book book) {
            borrower.returnBook(book);
            books.add(book);
            System.out.println(borrower.getName() + " has returned: " + book.title);
    }

    public void displayLibraryBooks() {
        System.out.println("Books in Library:");
        for (Book book : books) {
            System.out.println("Title: " + book.title);
            System.out.println("ISBN: " + book.isbn);
            System.out.println("Author: " + book.author.name);
            System.out.println("Biography: " + book.author.bio);
            System.out.println("---------------------");
    }
    }
}

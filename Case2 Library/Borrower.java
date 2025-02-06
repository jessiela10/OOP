import java.util.ArrayList;
import java.util.List;

public class Borrower{
    public String name;
    public List<Book> borrowedBooks;
    
    public Borrower(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }
    
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
    
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void displayBorrowedBooks() {
        System.out.println(name + "'s Borrowed Books:");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books currently borrowed.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println("Title: " + book.title);
                System.out.println("ISBN: " + book.isbn);
                System.out.println("Author: " + book.author.name);
                System.out.println("Biography: " + book.author.bio);
                System.out.println("---------------------");

            }
        }
    }  

}
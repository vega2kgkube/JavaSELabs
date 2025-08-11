package mylab.library.entity;
import java.util.ArrayList;
import java.util.List;

/**
 * ������ Ŭ����
 * Book ��ü���� �����ϰ� ����� ����
 */
public class Library {
    private List<Book> books;
    private String name;

    /**
     * ������
     */
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    /**
     * ������ �̸� ��ȯ
     */
    public String getName() {
        return name;
    }

    /**
     * ���� �߰� �޼ҵ�
     */
    public void addBook(Book book) {
        books.add(book);
        System.out.println("������ �߰��Ǿ����ϴ�: " + book.getTitle());
    }

    /**
     * �������� ���� �˻�
     * @return ù ��°�� ��ġ�ϴ� Book ��ü
     */
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    /**
     * ���ڸ����� ���� �˻�
     * @return ���ڰ� ��ġ�ϴ� Book ��ü �迭
     */
    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * ISBN���� ���� �˻�
     */
    public Book findBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    /**
     * ISBN���� ���� ����
     * @return ���� ���� ����
     */
    public boolean checkOutBook(String isbn) {
        Book book = findBookByISBN(isbn);
        if (book != null) {
            return book.checkOut();
        }
        return false;
    }

    /**
     * ISBN���� ���� �ݳ�
     * @return �ݳ� ���� ����
     */
    public boolean returnBook(String isbn) {
        Book book = findBookByISBN(isbn);
        if (book != null) {
            book.returnBook();
            return true;
        }
        return false;
    }

    /**
     * ���� ������ ���� ��� ��ȯ
     */
    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    /**
     * ��� ���� ��� ��ȯ
     */
    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    /**
     * �������� ��ü ���� �� ��ȯ
     */
    public int getTotalBooks() {
        return books.size();
    }

    /**
     * ���� ������ ���� �� ��ȯ
     */
    public int getAvailableBooksCount() {
        return getAvailableBooks().size();
    }

    /**
     * ���� ���� ���� �� ��ȯ
     */
    public int getBorrowedBooksCount() {
        return getTotalBooks() - getAvailableBooksCount();
    }
}
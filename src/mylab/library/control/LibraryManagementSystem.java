package mylab.library.control;

import java.util.List;

import mylab.library.entity.Book;
import mylab.library.entity.Library;

/**
 * mylab.library.entity
 */
public class LibraryManagementSystem {
    
    public static void main(String[] args) {
        // ������ ����
        Library library = new Library("�߾� ������");
        
        // ���� ���� ���� �� �߰�
        addSampleBooks(library);
        
        // ������ ���� ���
        System.out.println("===== " + library.getName() + " =====");
        System.out.println("��ü ���� ��: " + library.getTotalBooks());
        System.out.println("���� ���� ���� ��: " + library.getAvailableBooksCount());
        System.out.println("���� ���� ���� ��: " + library.getBorrowedBooksCount());
        System.out.println();
        
        // ���� �˻� �׽�Ʈ
        System.out.println("===== ���� �˻� �׽�Ʈ =====");
        testFindBook(library);
        
        // ���� ���� �׽�Ʈ
        System.out.println("\n===== ���� ���� �׽�Ʈ =====");
        testCheckOut(library);
        
        // ���� �ݳ� �׽�Ʈ
        System.out.println("\n===== ���� �ݳ� �׽�Ʈ =====");
        testReturn(library);
        
        // ���� ������ ���� ��� ���
        System.out.println("\n===== ���� ������ ���� ��� =====");
        displayAvailableBooks(library);
    }
    
    /**
     * ���� ���� �߰�
     */
    private static void addSampleBooks(Library library) {
        library.addBook(new Book("�ڹ� ���α׷���", "���ڹ�", "978-89-01-12345-6", 2022));
        library.addBook(new Book("��ü������ ��ǰ� ����", "����ȣ", "978-89-01-67890-1", 2015));
        library.addBook(new Book("Clean Code", "Robert C. Martin", "978-0-13-235088-4", 2008));
        library.addBook(new Book("Effective Java", "Joshua Bloch", "978-0-13-468599-1", 2018));
        library.addBook(new Book("Head First Java", "Kathy Sierra", "978-0-596-00920-5", 2005));
        library.addBook(new Book("�ڹ��� ����", "���ü�", "978-89-01-14077-4", 2019));
    }
    
    /**
     * ���� �˻� �׽�Ʈ
     */
    private static void testFindBook(Library library) {
        // �������� �˻�
        Book book = library.findBookByTitle("�ڹ��� ����");
        if (book != null) {
            System.out.println("�������� �˻� ���:");
            System.out.println(book);
        } else {
            System.out.println("�ش� ������ ������ ã�� �� �����ϴ�.");
        }
        
        // ���ڷ� �˻�
        List<Book> booksByAuthor = library.findBooksByAuthor("Robert C. Martin");
        System.out.println("\n���ڷ� �˻� ���:");
        if (!booksByAuthor.isEmpty()) {
            for (Book b : booksByAuthor) {
                System.out.println(b);
                //System.out.println("------------------------");
            }
        } else {
            System.out.println("�ش� ������ ������ ã�� �� �����ϴ�.");
        }
    }
    
    /**
     * ���� ���� �׽�Ʈ
     */
    private static void testCheckOut(Library library) {
        String isbn = "978-89-01-14077-4"; // �ڹ��� ����
        boolean success = library.checkOutBook(isbn);
        
        if (success) {
            System.out.println("���� ���� ����!");
            Book book = library.findBookByISBN(isbn);
            System.out.println("����� ���� ����:");
            System.out.println(book);
        } else {
            System.out.println("���� ���� ����: �ش� ������ ���ų� �̹� ���� ���Դϴ�.");
        }
        
        // ������ ���� ������Ʈ ���
        System.out.println("\n������ ���� ����:");
        System.out.println("��ü ���� ��: " + library.getTotalBooks());
        System.out.println("���� ���� ���� ��: " + library.getAvailableBooksCount());
        System.out.println("���� ���� ���� ��: " + library.getBorrowedBooksCount());
    }
    
    /**
     * ���� �ݳ� �׽�Ʈ
     */
    private static void testReturn(Library library) {
        String isbn = "978-89-01-14077-4"; // �ڹ��� ����
        boolean success = library.returnBook(isbn);
        
        if (success) {
            System.out.println("���� �ݳ� ����!");
            Book book = library.findBookByISBN(isbn);
            System.out.println("�ݳ��� ���� ����:");
            System.out.println(book);
        } else {
            System.out.println("���� �ݳ� ����: �ش� ������ ã�� �� �����ϴ�.");
        }
        
        // ������ ���� ������Ʈ ���
        System.out.println("\n������ ���� ����:");
        System.out.println("��ü ���� ��: " + library.getTotalBooks());
        System.out.println("���� ���� ���� ��: " + library.getAvailableBooksCount());
        System.out.println("���� ���� ���� ��: " + library.getBorrowedBooksCount());
    }
    
    /**
     * ���� ������ ���� ��� ���
     */
    private static void displayAvailableBooks(Library library) {
        List<Book> availableBooks = library.getAvailableBooks();
        if (!availableBooks.isEmpty()) {
            for (Book book : availableBooks) {
                System.out.println(book);
                System.out.println("------------------------");
            }
        } else {
            System.out.println("���� ���� ������ ������ �����ϴ�.");
        }
    }
}
package mylab.library.entity;
/**
 * ���� ������ ��� Ŭ����
 * ĸ��ȭ�� �����Ͽ� ��� ��� ������ private���� ����
 */
public class Book {
    private String title;
    private String author;
    private String isbn;
    private int publishYear;
    private boolean isAvailable;

    /**
     * �⺻ ������
     */
    public Book() {
        this.isAvailable = true; // �ʱ� ���� �� ������ ���� ���� ����
    }

    /**
     * ��� �ʵ带 �ʱ�ȭ�ϴ� ������
     */
    public Book(String title, String author, String isbn, int publishYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishYear = publishYear;
        this.isAvailable = true; // �ʱ� ���� �� ������ ���� ���� ����
    }

    /**
     * Getter�� Setter �޼ҵ�
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * ���� ���� �޼ҵ�
     * @return ���� ���� ����
     */
    public boolean checkOut() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    /**
     * ���� �ݳ� �޼ҵ�
     */
    public void returnBook() {
        isAvailable = true;
    }

    /**
     * ������ ���ڿ� ǥ���� ��ȯ
     */
    @Override
    public String toString() {
        return "å ����: " + title + 
               "\t����: " + author + 
               "\tISBN: " + isbn + 
               "\t���ǳ⵵: " + publishYear + 
               "\t���� ���� ����: " + (isAvailable ? "����" : "���� ��");
    }
}
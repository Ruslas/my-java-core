package repeat.repeat4;

public class Book implements Printable {
    private String bookTitle;
    private String bookAuthor;
    private int year;
    private String country;

    public Book(String bookTitle, String bookAuthor, int year, String country) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.year = year;
        this.country = country;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void print() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Book \"" + bookTitle + "\" " +
                bookAuthor + ": " + country + ", " + year + " year\n" + "PRINTING");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println();
        System.out.println("Book printed\n");
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}

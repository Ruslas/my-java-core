package lesson7.homework;

public class Reader {
    private String fullName, department, DOB, phoneNumber;
    private long libraryCard;

    public Reader(String fullName, String department, String DOB, String phoneNumber, long libraryCard) {
        this.fullName = fullName;
        this.department = department;
        this.DOB = DOB;
        this.phoneNumber = phoneNumber;
        this.libraryCard = libraryCard;
    }

    public Reader() {
        this.fullName = "Кучеренко Георгий Павлович";
        this.department = "Radiotecnica";
        this.DOB = "20 Feb 1994";
        this.phoneNumber = "+38 050 432 41 42";
        this.libraryCard = 12321551;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDepartment() {
        return department;
    }

    public String getDOB() {
        return DOB;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public long getLibraryCard() {
        return libraryCard;
    }

    public void takeBook(int bookNum) {
        String[] fullN = this.getFullName().split(" ");
        System.out.println(fullN[0] + " " + fullN[1].substring(0, 1) + ". " + fullN[2].substring(0, 1) + ". " + " взял " + bookNum + " книг");
    }

    public void takeBook(String... bookTitles) {
        String[] fullN = this.getFullName().split(" ");
        System.out.println(fullN[0] + " " + fullN[1].substring(0, 1) + ". " + fullN[2].substring(0, 1) + ". " + " взял книги: ");
        for (String bookTitle : bookTitles) {
            System.out.print(bookTitle + " ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        String[] fullN = this.getFullName().split(" ");
        System.out.println(fullN[0] + " " + fullN[1].substring(0, 1) + ". " + fullN[2].substring(0, 1) + ". " + " взял книги: ");
        for (Book book : books) {
            System.out.print(book.getTitle() + " ");
        }
        System.out.println();
    }
}

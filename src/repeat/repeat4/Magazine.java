package repeat.repeat4;

public class Magazine implements Printable {
    private String magazineTitle;
    private int year;
    private String country;

    public Magazine(String magazineTitle, int year, String country) {
        this.magazineTitle = magazineTitle;
        this.year = year;
        this.country = country;
    }

    public String getMagazineTitle() {
        return magazineTitle;
    }

    public void setMagazineTitle(String magazineTitle) {
        this.magazineTitle = magazineTitle;
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
        System.out.print("Magazine \"" + magazineTitle + "\" " +
                ": " + country + ", " + year + " year\n" + "PRINTING");

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println();
        System.out.println("Magazine printed\n");
    }
}

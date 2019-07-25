package repeat.repeat4;

public class Newspaper {
    private String newspaperTitle;
    private int number;
    private String country;

    public Newspaper(String newspaperTitle, int number, String country) {
        this.newspaperTitle = newspaperTitle;
        this.number = number;
        this.country = country;
    }

    public String getNewspaperTitle() {
        return newspaperTitle;
    }

    public void setNewspaperTitle(String newspaperTitle) {
        this.newspaperTitle = newspaperTitle;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void print(Printable p){
        p.print();
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "newspaperTitle='" + newspaperTitle + '\'' +
                ", number=" + number +
                ", country='" + country + '\'' +
                '}';
    }
}

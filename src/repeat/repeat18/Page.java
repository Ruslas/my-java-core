package repeat.repeat18;

import java.util.*;

public class Page {
    private String text = "";
    private List<String> pictures = new ArrayList<>();

    public Page(String text, List<String> pictures) {
        this.text = text;
        this.pictures = pictures;
    }

    public Page(String text) {
        this.text = text;
    }

    public Page() {
    }

    public void addPicture(String path) {
        pictures.add(path);
    }

    public void addText(String text){
        this.text = "\n" + text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Page page = (Page) o;

        if (text != null ? !text.equals(page.text) : page.text != null) return false;
        return pictures != null ? pictures.equals(page.pictures) : page.pictures == null;
    }

    @Override
    public int hashCode() {
        int result = text != null ? text.hashCode() : 0;
        result = 31 * result + (pictures != null ? pictures.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Page{" +
                "text='" + text + '\'' +
                ", pictures=" + pictures +
                '}';
    }
}

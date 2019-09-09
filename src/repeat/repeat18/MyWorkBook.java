package repeat.repeat18;

import java.util.ArrayList;
import java.util.List;

public class MyWorkBook implements WorkBook{
    private String name;
    private String pass;
    private List<Page> pages;
    private Page onPage;
    private boolean open = false;

    public MyWorkBook(String name, String pass) {
        this.name = name;
        this.pass = pass;
        pages = new ArrayList<>();
    }

    public void openBook(String pass) {
        if (pass.equals(this.pass)) {
            open = true;
        } else System.out.println("Wrong password");
    }

    public void close() {
        this.open = false;
    }

    public Page getOnPage() {
        return onPage;
    }

    public void setOnPage(Page onPage) {
        this.onPage = onPage;
    }

    public void openPage(int index) {
        onPage = pages.get(index);
    }

    public Page getPage(int index) {
        return pages.get(index);
    }

    public void addPage() {
        pages.add(new Page());
    }

    public void addPage(Page page) {
        pages.add(page);
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void readPage(){
        System.out.println(onPage);
    }

    @Override
    public void addPicture(String path) {
        if (onPage != null) {
            onPage.addPicture(path);
        } else System.out.println("Open page first");
    }

    @Override
    public void addText(String text) {
        onPage.addText(text);
    }

    @Override
    public void deletePage(int number) {
        pages.remove(number);
    }
}

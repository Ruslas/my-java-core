package repeat.patterns.observer;

public class Vocation {
    private String positionName;
    private String title;
    private int minSalary;
    private int maxSalary;
    private String description;

    public Vocation(String positionName, String title, int minSalary, int maxSalary, String description) {
        this.positionName = positionName;
        this.title = title;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.description = description;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void printVocationInfo(){
        System.out.println(title);
        System.out.println("Wanted " + positionName);
        System.out.println("Salary: " + minSalary + " - " + maxSalary);
        System.out.println(description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vocation vocation = (Vocation) o;

        if (minSalary != vocation.minSalary) return false;
        if (maxSalary != vocation.maxSalary) return false;
        if (positionName != null ? !positionName.equals(vocation.positionName) : vocation.positionName != null)
            return false;
        if (title != null ? !title.equals(vocation.title) : vocation.title != null) return false;
        return description != null ? description.equals(vocation.description) : vocation.description == null;
    }

    @Override
    public int hashCode() {
        int result = positionName != null ? positionName.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + minSalary;
        result = 31 * result + maxSalary;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}

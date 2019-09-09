package repeat.repeat19;

public class NamedBox {
    private String name;
    private int a;
    private int b;
    private  int c;

    public NamedBox(String name, int a, int b, int c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NamedBox namedBox = (NamedBox) o;

        if (a != namedBox.a) return false;
        if (b != namedBox.b) return false;
        if (c != namedBox.c) return false;
        return name != null ? name.equals(namedBox.name) : namedBox.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + a;
        result = 31 * result + b;
        result = 31 * result + c;
        return result;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c;
    }
}

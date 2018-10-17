package test;

public class C extends B {
    int n;

    public C(int a, int b, int e, int n) {
        super(a, b, e);
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getSuperSuperA(){
        return super.getSuperA();
    }

    public int getSuperSuperB(){
        return super.getSuperB();
    }
}

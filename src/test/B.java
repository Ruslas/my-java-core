package test;

public class B extends A {
    int a;
    int b;
    int e;

    public B(int a, int b, int e) {
        this.a = a;
        this.b = b;
        this.e = e;
    }

    public B() {
    }

    @Override
    public int getA() {
        return a;
    }

    @Override
    public void setA(int a) {
        this.a = a;
    }

    @Override
    public int getB() {
        return b;
    }

    @Override
    public void setB(int b) {
        this.b = b;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getSuperA(){
        return super.a;
    }

    public int getSuperB(){
        return super.b;
    }
}

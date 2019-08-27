package repeat.repeat17;

public class SubClass extends SuperClass {
    public int a;
    public int b;

    public SubClass(int a, int a1, int b) {
        super.a = a;
        this.a = a1;
        this.b = b;
    }

    @Override
    public int getA() {
        return a;
    }

    @Override
    public void print(){
        System.out.println("In Sub");
    }

    public void doJobInSub(){
        System.out.println("doJobInSub");
    }
}

package repeat.repeat17;

public class GenericA <T> {
    private T someT;

    public GenericA(T someT) {
        this.someT = someT;
    }

    public T getSomeT() {
        return someT;
    }

    public void setSomeT(T someT) {
        this.someT = someT;
    }

    public void printInfo(){
        System.out.println("T - " + someT.getClass().getSimpleName());
    }
}

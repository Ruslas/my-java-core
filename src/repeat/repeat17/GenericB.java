package repeat.repeat17;

public class GenericB <V, T> extends GenericA {
    private V someV;

    public GenericB(T someT, V someV) {
        super(someT);
        this.someV = someV;
    }

    public V getSomeV() {
        return someV;
    }

    public void setSomeV(V someV) {
        this.someV = someV;
    }

    @Override

    public void printInfo(){
        System.out.println("T - " + getSomeT().getClass().getSimpleName());
        System.out.println("V - " + someV.getClass().getSimpleName());
    }
}

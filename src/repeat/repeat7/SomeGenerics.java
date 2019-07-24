package repeat.repeat7;

public class SomeGenerics <T, V, K> {
    private T tParam;
    private V vParam;
    private K kParam;

    public SomeGenerics(T tParam, V vParam, K kParam) {
        this.tParam = tParam;
        this.vParam = vParam;
        this.kParam = kParam;
    }

    public T gettParam() {
        return tParam;
    }

    public void settParam(T tParam) {
        this.tParam = tParam;
    }

    public V getvParam() {
        return vParam;
    }

    public void setvParam(V vParam) {
        this.vParam = vParam;
    }

    public K getkParam() {
        return kParam;
    }

    public void setkParam(K kParam) {
        this.kParam = kParam;
    }

    public void printTypes(){
        System.out.println("T " + tParam.getClass().getSimpleName()
        + "\nV " + vParam.getClass().getSimpleName()
        + "\nK " + kParam.getClass().getSimpleName());
    }
}

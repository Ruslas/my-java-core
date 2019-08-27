package repeat.repeat17;

import lesson8.clinic.Animal;

import java.io.Serializable;

public class Generic <T extends Comparable,
        V extends Animal & Serializable ,
        K extends Number> {
    private T tem;
    private V vem;
    private K kem;

    public Generic(T tem, V vem, K kem){
        this.tem = tem;
        this.kem = kem;
        this.vem = vem;
    }

    public T getTem() {
        return tem;
    }

    public void setTem(T tem) {
        this.tem = tem;
    }

    public V getVem() {
        return vem;
    }

    public void setVem(V vem) {
        this.vem = vem;
    }

    public K getKem() {
        return kem;
    }

    public void setKem(K kem) {
        this.kem = kem;
    }

    public void printTypes(){
        System.out.println("T - " + tem.getClass().getSimpleName() +
                " V - " + vem.getClass().getSimpleName() +
                " K - " + kem.getClass().getSimpleName());
    }
}

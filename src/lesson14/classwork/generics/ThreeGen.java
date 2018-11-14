package lesson14.classwork.generics;

import lesson8.clinic.Animal;

import java.io.Serializable;

public class ThreeGen<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T ob1;
    private V ob2;
    private K ob3;

    ThreeGen(T o1, V o2, K o3) {
        ob1 = o1;
        ob2 = o2;
        ob3 = o3;
    }

    void showTypes() {
        System.out.println("Type of T is "
                + ob1.getClass().getName());

        System.out.println("Type of V is "
                + ob2.getClass().getName());

        System.out.println("Type of K is "
                + ob3.getClass().getName());
    }

    public T getOb1() {
        return ob1;
    }

    public void setOb1(T ob1) {
        this.ob1 = ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public void setOb3(K ob3) {
        this.ob3 = ob3;
    }
}

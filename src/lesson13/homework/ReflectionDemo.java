package lesson13.homework;

import java.util.Arrays;

import com.company.vehicles.Car;
import com.company.vehicles.Lorry;

public class ReflectionDemo {
    public static void main(String[] args) {
        Class lorryClass = Lorry.class;
        Class carClass = Car.class;
        Class arrClass = Arrays.class;
        printInfo(lorryClass);
        printInfo(carClass);
        printInfo(arrClass);
    }

    public static void printInfo(Class cl) {
        System.out.println("Class name " + cl.getName());
        System.out.println("Is Array? " + cl.isArray());
        System.out.println("Is Interface? " + cl.isInterface());
        System.out.println("Is Primitive? " + cl.isPrimitive());
        System.out.println("Declared Classes: "
                + Arrays.toString(cl.getDeclaredClasses()));
        System.out.println("Classes: "
                + Arrays.toString(cl.getClasses()));
        System.out.println("Declared Constructors: "
                + Arrays.toString(cl.getDeclaredConstructors()));
        System.out.println("Constructors: "
                + Arrays.toString(cl.getConstructors()));
        System.out.println("Declared Methods: "
                + Arrays.toString(cl.getDeclaredMethods()));
        System.out.println("Methods: "
                + Arrays.toString(cl.getMethods()));
        System.out.println("Declared Fields: "
                + Arrays.toString(cl.getDeclaredFields()));
        System.out.println("Fields: "
                + Arrays.toString(cl.getFields()));
        System.out.println("Superclass: " + cl.getSuperclass());
        System.out.println("Package: " + cl.getPackageName());
        System.out.println("Modifiers: " + cl.getModifiers());
    }
}

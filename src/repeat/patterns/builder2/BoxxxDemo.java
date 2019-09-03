package repeat.patterns.builder2;

public class BoxxxDemo {
    public static void main(String[] args){
        Boxxx boxxx = new  Boxxx.Builder().withHeight(22).withLength(15).withWeight(21).withWidth(10).build();

        System.out.println(boxxx);
    }
}

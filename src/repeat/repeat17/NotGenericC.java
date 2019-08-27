package repeat.repeat17;

public class NotGenericC extends GenericA {
    private String someStr;

    public NotGenericC(Object someT, String someStr) {
        super(someT);
        this.someStr = someStr;
    }

    public String getSomeStr() {
        return someStr;
    }

    public void setSomeStr(String someStr) {
        this.someStr = someStr;
    }

    @Override
    public void printInfo(){
        System.out.println("T - " + getSomeT().getClass().getSimpleName());
        System.out.println("String");
    }
}

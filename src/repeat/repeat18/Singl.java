package repeat.repeat18;

import repeat.patterns.builder.PenColors;

public enum Singl {
    SINGL;

    private int a;
    private String str;

    Singl() {
    }

    Singl(int a, String str){
        this.a = a;
        this.str = str;
    }

    public static class Builder{
        private Singl newSingl;

        Builder(){
            newSingl = Singl.SINGL;
        }

        public Builder withA(int a){
            newSingl.a = a;
            return this;
        }

        public Builder withStr(String str){
            newSingl.str = str;
            return this;
        }

        public Singl build(){
            return newSingl;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}

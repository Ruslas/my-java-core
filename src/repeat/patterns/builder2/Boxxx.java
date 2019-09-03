package repeat.patterns.builder2;

public class Boxxx {
    private int height;
    private int width;
    private int length;
    private int weight;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (notNegative(height))
            this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (notNegative(width))
            this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (notNegative(length))
            this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (notNegative(weight))
            this.weight = weight;
    }

    public static class Builder {
        private Boxxx newBoxxx;

        public Builder() {
            newBoxxx = new Boxxx();
        }

        public Builder withHeight(int height) {
            if (notNegative(height))
                newBoxxx.height = height;
            return this;
        }

        public Builder withWidth(int width) {
            if (notNegative(width))
                newBoxxx.width = width;
            return this;
        }

        public Builder withLength(int length) {
            if (notNegative(length))
                newBoxxx.length = length;
            return this;
        }

        public Builder withWeight(int weight) {
            if (notNegative(weight))
                newBoxxx.weight = weight;
            return this;
        }

        public Boxxx build() {
            return newBoxxx;
        }
    }

    private static boolean notNegative(int n) {
        if (n < 0) {
            System.out.println("Illegal negative number");
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Boxxx boxxx = (Boxxx) o;

        if (height != boxxx.height) return false;
        if (width != boxxx.width) return false;
        if (length != boxxx.length) return false;
        return weight == boxxx.weight;
    }

    @Override
    public int hashCode() {
        int result = height;
        result = 31 * result + width;
        result = 31 * result + length;
        result = 31 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return "Boxxx{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", weight=" + weight +
                '}';
    }
}

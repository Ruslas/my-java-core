package repeat.patterns.builder;

import static repeat.patterns.builder.PenException.ILLEGAL_PEN_THICKNESS;
import static repeat.patterns.builder.PenException.NOT_ENOUGH_INK;

public class Pen {
    private String mark;
    private PenColors penColor;
    private double thickness;
    private double penFullness = 100;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public PenColors getPenColor() {
        return penColor;
    }

    private void setPenColor(PenColors penColor) {
        this.penColor = penColor;
    }

    public double getThickness() {
        return thickness;
    }

    private void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public double getPenFullness() {
        return penFullness;
    }

    private void setPenFullness(double penFullness) {
        this.penFullness = penFullness;
    }

    public static class Builder {
        private Pen newPen;

        public Builder() {
            newPen = new Pen();
        }

        public Builder withMark(String mark) {
            newPen.mark = mark;
            return this;
        }

        public Builder withPenColor(PenColors penColor) {
            newPen.penColor = penColor;
            return this;
        }

        public Builder withThickness(double thickness) throws PenException {
            if (thickness < 0.1 | thickness > 3)
                throw new PenException(ILLEGAL_PEN_THICKNESS);
            newPen.thickness = thickness;
            return this;
        }

        public Builder withPenFullness() {
            newPen.penFullness = 100;
            return this;
        }

        public Pen build() {
            return newPen;
        }
    }

    public void wright(char c) throws PenException {
        if (penFullness <= 0.1)
            throw new PenException(NOT_ENOUGH_INK);
        if (c != ' ') {
            penFullness -= 0.1;
        }
        System.out.print(c);
    }

    public void wright(String s) throws PenException {
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
           wright(c[i]);
        }
    }

}

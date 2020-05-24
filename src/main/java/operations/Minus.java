package operations;

public class Minus {
    private double minusValue;

    public Minus() {
    }

    public Minus(Double minusValue) {
        this.minusValue = minusValue;
    }

    public Double getMinusValue() {
        return minusValue;
    }

    public void setMinusValue(double minusValue) {
        this.minusValue = minusValue;
    }

    public double minusValue(double equals) {
        return equals - minusValue;
    }
}

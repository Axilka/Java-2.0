package operations;

public class Divide {
    private Double divideValue;

    public Divide() {
    }

    public Divide(Double divideValue) {
        this.divideValue = divideValue;
    }

    public Double getDivideValue() {
        return divideValue;
    }

    public void setDivideValue(Double divideValue) {
        this.divideValue = divideValue;
    }

    public double divideValue(double equals) {
        return equals/divideValue;
    }
}

package operations;

public class Divide {
    private double divideValue;

    public Divide() {
    }

    public Divide(Double divideValue) {
        this.divideValue = divideValue;
    }

    public Double getDivideValue() {
        return divideValue;
    }

    public void setDivideValue(double divideValue) {
        this.divideValue = divideValue;
    }

    public double divideValue(double equals) {
        if (divideValue == 0) {
            throw new ArithmeticException("Деление на ноль невозможно ");
        }
        return equals / divideValue;
    }
}

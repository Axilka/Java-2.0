package operations;

public class Multiply {
    private double multiplyValue;

    public Multiply() {
    }

    public Multiply(Double multiplyValue) {
        this.multiplyValue = multiplyValue;
    }

    public Double getMultiplyValue() {
        return multiplyValue;
    }

    public void setMultiplyValue(double multiplyValue) {
        this.multiplyValue = multiplyValue;
    }

    public double multiplyValue(double equals) {
        return equals * multiplyValue;
    }
}


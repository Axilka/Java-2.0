package operations;

public class Multiply {
    private Double multiplyValue;

    public Multiply() {
    }

    public Multiply(Double multiplyValue) {
        this.multiplyValue = multiplyValue;
    }

    public Double getMultiplyValue() {
        return multiplyValue;
    }

    public void setMultiplyValue(Double multiplyValue) {
        this.multiplyValue = multiplyValue;
    }

    public double multiplyValue(double equals) {
        return equals*multiplyValue;
    }
}


package operations;

public class Plus {
    private Double plusValue;

    public Plus() {
    }

    public Plus(Double value) {
        this.plusValue = value;
    }

    public Double getPlusValue() {
        return plusValue;
    }

    public void setPlusValue(double value) {
        this.plusValue = value;
    }

    public double plusValue(double equals) {
        return equals + plusValue;
    }
}

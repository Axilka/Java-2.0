package staff;

public class Chocolate extends Staff {
    private String color;

    public Chocolate() {
    }

    public Chocolate(Double weight, Double price) {
        super(weight, price);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Chocolate [" + super.toString() + ", color = " + color + "]";
    }
}

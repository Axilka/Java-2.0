package staff;

public class Candy extends Staff {
    private String type;

    public Candy(Double weight, Double price, String type) {
        super(weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Candy [" + super.toString() + ", type = " + type + "]";
    }
}

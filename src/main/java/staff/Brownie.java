package staff;

public class Brownie extends Staff {
    private Double calories;

    public Brownie(Double weight, Double price, Double calories) {
        super(weight, price);
        this.calories = calories;
    }

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Brownie [" + super.toString() + ", calories = " + calories + "]";
    }
}

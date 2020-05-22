package staff;

public class Jellybean extends Staff {
    private String flavor;

    public Jellybean() {
    }

    public Jellybean(Double weight, Double price, String flavor) {
        super(weight, price);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Jellybean [" + super.toString() + ", flavor = " + flavor + "]";
    }
}

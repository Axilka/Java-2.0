package operations;

public class Divide {
    private double divideValue;
    private double save = 0;

    public Divide() {
    }

    public Divide(Double divideValue) {
        this.divideValue = divideValue;
    }

    public Double getDivideValue() {
        return divideValue;
    }

    public Double getSave() {
        return save;
    }

    public void setDivideValue(double divideValue) {
        this.divideValue = divideValue;
    }

    public double divideValue(double equals) {
        //Переменная save будет сохранять значение, чтобы можно было продолжить делить, если до этого было деление на 0
        //чтобы не сбрасывался результат прошлой цепочки вычислений
        try {
            save = equals;
            equals = equals / divideValue;

            if (divideValue == 0) {
                throw new ArithmeticException("Деление на ноль невозможно ");
            }
        } catch (ArithmeticException ex) {
            System.err.println("Деление на ноль, введите корректное число: " + ex);
        }

        if (divideValue == 0) {
            return save;
        } else
            return equals;
    }
}

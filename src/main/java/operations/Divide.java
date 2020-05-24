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
        //Переменная save будет сохранять значение, чтобы можно было продолжить делить, если до этого было деление на 0
        //чтобы не сбрасывался результат прошлой цепочки вычислений
        double save = 0;

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
